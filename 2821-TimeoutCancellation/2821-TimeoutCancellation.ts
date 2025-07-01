// Last updated: 7/1/2025, 11:03:56 PM
type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type Fn = (...args: JSONValue[]) => void;

function cancellable(fn: Fn, args: JSONValue[], t: number): Function {
    let timeoutId: NodeJS.Timeout | null = setTimeout(() => {
        fn(...args);
    }, t);

    return () => {
        if (timeoutId !== null) {
            clearTimeout(timeoutId);
            timeoutId = null;
        }
    };
}

/**
 * Example usage:
 * 
 * const result: { time: number, returned: any }[] = [];
 *
 * const fn = (x: number) => x * 5;
 * const args = [2], t = 20, cancelTimeMs = 50;
 *
 * const start = performance.now();
 *
 * const log = (...argsArr: JSONValue[]) => {
 *     const diff = Math.floor(performance.now() - start);
 *     result.push({ "time": diff, "returned": fn(...argsArr) });
 * }
 *       
 * const cancel = cancellable(log, args, t);
 *
 * const maxT = Math.max(t, cancelTimeMs);
 *           
 * setTimeout(cancel, cancelTimeMs);
 *
 * setTimeout(() => {
 *     console.log(result); // Expected output: [{"time":20,"returned":10}] if the cancel is after fn execution.
 * }, maxT + 15);
 */

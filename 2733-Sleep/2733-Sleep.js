// Last updated: 7/1/2025, 11:04:13 PM
/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    return new Promise((resolve) => setTimeout(resolve , millis))
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */
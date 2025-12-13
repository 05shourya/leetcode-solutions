// Last updated: 12/14/2025, 12:13:57 AM
1import java.util.*;
2
3class Solution {
4    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
5
6        // Business line priority
7        Map<String, Integer> priority = new HashMap<>();
8        priority.put("electronics", 0);
9        priority.put("grocery", 1);
10        priority.put("pharmacy", 2);
11        priority.put("restaurant", 3);
12
13        List<Pair> valid = new ArrayList<>();
14
15        for (int i = 0; i < code.length; i++) {
16            if (isActive[i] && priority.containsKey(businessLine[i]) && isValidCode(code[i])) {
17                valid.add(new Pair(priority.get(businessLine[i]), code[i]));
18            }
19        }
20
21        Collections.sort(valid, (a, b) -> {
22            if (a.priority != b.priority)
23                return a.priority - b.priority;
24            return a.code.compareTo(b.code);
25        });
26
27        List<String> result = new ArrayList<>();
28        for (Pair p : valid) {
29            result.add(p.code);
30        }
31
32        return result;
33    }
34
35    private boolean isValidCode(String s) {
36        if (s.length() == 0) return false;
37        for (char c : s.toCharArray()) {
38            if (!Character.isLetterOrDigit(c) && c != '_')
39                return false;
40        }
41        return true;
42    }
43
44    static class Pair {
45        int priority;
46        String code;
47
48        Pair(int priority, String code) {
49            this.priority = priority;
50            this.code = code;
51        }
52    }
53}
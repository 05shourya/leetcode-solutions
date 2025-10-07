// Last updated: 10/7/2025, 11:25:37 PM
import java.util.*; 
class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> map = new HashMap<>(); 
        NavigableSet<Integer> zeroes = new TreeSet<>(); 

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                zeroes.add(i); 
                ans[i] = 1; 
            } else {
                ans[i] = -1; 
                if (map.containsKey(rains[i])) {
                    Integer zero = zeroes.ceiling(map.get(rains[i]));
                    if (zero == null) {
                        return new int[0]; 
                    }
                    ans[zero] = rains[i]; 
                    zeroes.remove(zero);
                }
                map.put(rains[i], i); 
            }
        }

        return ans;
    }
}

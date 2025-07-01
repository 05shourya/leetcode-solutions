// Last updated: 7/1/2025, 11:03:15 PM
import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        Integer counter[] = new Integer[26]; 
        int res = 0; 

        Arrays.fill(counter, 0);

        for (char character : word.toCharArray()) {
            counter[(int) character - (int) 'a'] += 1;
        }

        Arrays.sort(counter, Collections.reverseOrder());

        for (int i = 0; i < 26; i++) {
            int count = counter[i];
            res += count * ((i / 8) + 1); 
            System.out.println(res);
        }

        return res; 
    }
}

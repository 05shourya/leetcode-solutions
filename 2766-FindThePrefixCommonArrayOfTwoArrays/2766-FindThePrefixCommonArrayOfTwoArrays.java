// Last updated: 7/1/2025, 11:04:09 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer,Integer> map = new HashMap<>(); 
        int res[] = new int[A.length]; 
        int count = 0 ; 

        for(int i = 0 ; i < A.length ; i++){
            map.put(A[i] , map.getOrDefault(A[i] , 0) + 1); 
            map.put(B[i] , map.getOrDefault(B[i] , 0) + 1);

            if(A[i] == B[i]) count++; 
            else {
                if(map.get(A[i]) > 1) count++; 
                if(map.get(B[i]) > 1) count++;
            }  
            res[i] = count;  
        }
        return res; 
    }
}
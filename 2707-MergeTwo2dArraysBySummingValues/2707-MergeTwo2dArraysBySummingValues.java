// Last updated: 7/1/2025, 11:04:20 PM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int l = 0 , r = 0; 
        int m = nums1.length, n = nums2.length; 
        List<int[]> res = new ArrayList<>(); 

        while(l < m && r < n){
            if (nums1[l][0] < nums2[r][0]) {
                res.add(new int[]{nums1[l][0], nums1[l][1]});
                l++;
            } else if (nums1[l][0] > nums2[r][0]) {
                res.add(new int[]{nums2[r][0], nums2[r][1]});
                r++;
            } else {
                res.add(new int[]{nums1[l][0], nums1[l][1] + nums2[r][1]});
                l++;
                r++;
            }
        }

        while(l < m){
            res.add(new int[]{nums1[l][0], nums1[l][1]});
            l++;
        }

        while(r < n){
            res.add(new int[]{nums2[r][0], nums2[r][1]});
            r++;
        }

        return res.toArray(new int[res.size()][]); 
    }
}
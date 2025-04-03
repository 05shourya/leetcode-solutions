// Last updated: 4/4/2025, 1:00:21 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean flag = true; 
    
    public void traverse(TreeNode p , TreeNode q){

        if(p == null || q == null){
            if(p != q){
                flag = false;  
            }

            return ; 

        }

        traverse(p.left , q.left); 
        if(p.val != q.val) {
            flag = false; 
            return;  
        }  
        traverse(p.right , q.right); 
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverse(p , q); 
        return flag; 
    }
}
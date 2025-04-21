// Last updated: 4/21/2025, 10:27:34 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int total = 1; 
        ListNode temp = head; 
        while(temp.next != null){
            temp = temp.next; 
            total++; 
        }
        temp.next = head; 
        k = k % total; 
        int limit = total - k; 

        ListNode temp2 = head; 
        
        for(int i = 1 ; i < limit ; i++){
            temp2 = temp2.next; 
        }

        ListNode ans = temp2.next; 
        temp2.next = null; 
        
        return ans; 
    }
}
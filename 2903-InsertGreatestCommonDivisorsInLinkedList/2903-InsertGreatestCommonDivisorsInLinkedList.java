// Last updated: 7/1/2025, 11:03:50 PM
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
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null ) return head;

        ListNode current = head; 

        while(current != null && current.next != null){
            int gcdVal = gcd(current.val , current.next.val); 

            ListNode newNode = new ListNode(gcdVal);

            newNode.next = current.next; 
            current.next = newNode; 

            current = newNode.next;  
        } 

        return head; 
    }
}
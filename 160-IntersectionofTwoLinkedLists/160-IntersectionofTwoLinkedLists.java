// Last updated: 4/16/2025, 10:46:22 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> setA = new HashSet<>(); 
        while(headA != null){
            setA.add(headA); 
            headA = headA.next; 
        }

        while(headB != null){
            if(setA.contains(headB)){
                return headB; 
            }
            headB = headB.next; 
        }

        return null; 
    }
}
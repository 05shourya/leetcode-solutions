// Last updated: 8/24/2026, 4:21:27 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode res = new ListNode(); 
14        ListNode current = res; 
15
16        while(list1 != null && list2 != null){
17            if(list1.val <= list2.val){
18                current.next = list1; 
19                list1 = list1.next; 
20            }else{
21                current.next = list2; 
22                list2 = list2.next; 
23            }
24            current = current.next; 
25        }
26        if(list1 != null){
27            current.next = list1; 
28        }else{
29            current.next = list2; 
30        }
31        return res.next;
32    }
33}
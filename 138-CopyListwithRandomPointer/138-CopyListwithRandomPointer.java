// Last updated: 4/23/2025, 12:05:57 AM
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        Node dummy = new Node(0);
        Node copyCurr = dummy;
        curr = head;

        while (curr != null) {
            copyCurr.next = curr.next;
            curr.next = curr.next.next;

            curr = curr.next;
            copyCurr = copyCurr.next;
        }

        return dummy.next;
    }
}

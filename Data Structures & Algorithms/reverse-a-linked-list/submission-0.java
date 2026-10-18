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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        Collections.reverse(list);

        ListNode temp = new ListNode(0);
        ListNode start = temp;

        for (int val : list) {
            ListNode d1 = new ListNode(val);
            temp.next = d1;
            temp = d1;
        }
        temp.next = null;
        return start.next;
    }
}

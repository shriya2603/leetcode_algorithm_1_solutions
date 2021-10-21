// Link - https://leetcode.com/problems/middle-of-the-linked-list/
// Time Complexity: O(n) , Space Complexity: O(1) 
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
    public ListNode middleNode(ListNode head) {
        ListNode f=head, s =head;
        while(f!=null&& f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
}

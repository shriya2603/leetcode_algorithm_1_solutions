// Link - https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode s = new ListNode(0);
        s.next=head;
        ListNode fast =s, slow=s;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next = slow.next.next;
        return s.next;
    }
}

// Time Complexity: O(2n) , Space Complexity: O(1)
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode dummyNode= new ListNode(0);
// 		dummyNode.next=head;
// 		int length=0;
// 		ListNode node=dummyNode;
// 		while(node!=null) {
// 			length++;
// 			node=node.next;
// 		}
// 		node=dummyNode;
// 		length=length-n;
// 		while(length>1) {
// 			length--;
// 			node=node.next;
// 		}
// 		ListNode temp=node.next.next;
// 		node.next=temp;
		
// 		head=dummyNode.next;
//         return head;
     
//     }
// }
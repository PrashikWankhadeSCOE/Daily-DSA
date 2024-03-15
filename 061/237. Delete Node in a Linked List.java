
//  Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    public void deleteNode(ListNode node) {
        while(node.next.next != null){
            int temp = node.val;
            node.val = node.next.val;
            node.next.val = temp;
            node = node.next;
        }
        if(node.next!=null){
            int temp = node.val;
            node.val = node.next.val;
            node.next.val = temp;
        }
        node.next = null;
    }
}


//  Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp2 = head;
        int length = 0;
        while(temp2!=null){
            length++;
            temp2 = temp2.next;
        }
        if(length == 1 && n == 1){
            head = null;
            return head;
        }
        n = length-n;
        if(n == 0){
            head = head.next;
            return head;
        }
        while(n-1>0){
            temp = temp.next;
            n--;
        }
        if(temp.next == null){
            temp = null;
            return head;
        }
        if(temp.next.next == null){
            temp.next = null;
        }
        
        else{
            temp.next = temp.next.next;
        }
        return head;
    }

}

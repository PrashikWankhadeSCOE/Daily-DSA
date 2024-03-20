

//  Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }  

class Solution {
    ListNode head;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            if(sum>9){
                carry = 1;
            }
            else{
                carry = 0;
            }
            ListNode node = new ListNode(sum%10);
            if(head == null){
                head = node;
            }else{
                ListNode temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = node;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int sum = l1.val + carry;
            if(sum>9){
                carry = 1;
            }else{
                carry = 0;
            }
            ListNode node = new ListNode(sum%10);
            if(head == null){
                head = node;
            }else{
                ListNode temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = node;
            }
            l1 = l1.next;
        }
        while(l2 != null){
            int sum = l2.val + carry;
            if(sum>9){
                carry = 1;
            }else{
                carry = 0;
            }
            ListNode node = new ListNode(sum%10);
            if(head == null){
                head = node;
            }else{
                ListNode temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = node;
            }
            l2 = l2.next;
        }
        if(carry == 1){
            ListNode node = new ListNode(carry);
            if(head == null){
                head = node;
            }else{
                ListNode temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = node;
            }
        }
        return head;
    }
}

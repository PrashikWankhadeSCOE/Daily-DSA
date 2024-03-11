
//  Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    ListNode ret = null;
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forward = null;
        while(curr!=null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    public void addFirst(int num){
        ListNode newNode = new ListNode(num);
        if(ret == null){
            ret = newNode;
        }else{
            newNode.next = ret;
            ret = newNode;
        }
        // System.out.println(num);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        int rem = 0;
        while(l1 != null && l2 != null){
            // System.out.println(l1.val +" "+ l2.val + " "+ rem);
            int sum = l1.val + l2.val + rem;
            if(sum>9){
                rem = 1;
            }else{
                rem = 0;
            }
            addFirst(sum%10);
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            int sum = rem + l1.val;
            if(sum>9){
                rem = 1;
            }
            else{
                rem = 0;
            }
            
            addFirst(sum%10);
            l1 = l1.next;
            
        }
        while(l2!=null){
            int sum = rem + l2.val;
            if(sum>9){
                rem = 1;
            }
            else{
                rem = 0;
            }
            
            addFirst(sum%10);
            l2 = l2.next;
        }
        if(rem == 1){
            addFirst(1);
        }
        return ret;
    }
}
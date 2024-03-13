
import java.util.*;


//! SC == O(1)

//  Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

 class Solution1 {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode temp = head1;
        int len1 = 0;
        while(temp!=null){
            len1++;
            temp = temp.next;
        }
        temp = head2;
        int len2 = 0;
        while(temp!=null){
            len2++;
            temp = temp.next;
        }
        int count = Math.abs(len1 - len2);
        while(count != 0){
            if(len1 > len2){
                head1 = head1.next;
            }
            else{
                head2 = head2.next;
            }
            count--;
        }
        while(head1!=null){
            if(head1 == head2){
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return  head1;
    }
}

//! SC == O(N+M)
 
 class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> map = new HashMap<>();
        ListNode temp = headA;
        while(temp!=null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp,1);
            temp = temp.next;
        }
        temp = headB;
        while(temp!=null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp,1);
            temp = temp.next;
        }
        return temp;
    }
}
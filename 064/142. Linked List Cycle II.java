
// Definition for singly-linked list.

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


class SolutionO {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow!=null && fast!=null){
            slow = slow.next;
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
            }else{
                return null;
            }

            if(slow == fast){
                fast = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
// Extra space used
 class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode,Integer> map = new HashMap<>();
        while(head!=null){
            if(map.containsKey(head)){
                return head;
            }else{
                map.put(head,1);
            }
            head = head.next;
        }
        return null;
    }
}
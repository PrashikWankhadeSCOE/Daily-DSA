import java.util.*;

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


class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();

        Node temp = head;
        Node newhead = null;
        map.put(null,null);
        
        while(temp != null){
            Node newNode = new Node(temp.val);
            if(newhead == null){
                newhead = newNode;
            }else{
                Node temp1 = newhead;
                while(temp1.next != null){
                    temp1 = temp1.next;
                }
                temp1.next = newNode;
            }
            map.put(temp,newNode);
            temp = temp.next;
        }
        
        temp = head;
        Node temp2 = newhead;

        while(temp != null){
            temp2.random = map.get(temp.random);
            temp = temp.next;
            temp2 = temp2.next;
        }
        return newhead;
    }
}
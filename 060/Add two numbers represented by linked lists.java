
//  node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}



class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse(Node temp){
        
        Node prev = null;
        Node curr = temp;
        Node forw = null;
        
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        
        Node head = null;
        first = reverse(first);
        second = reverse(second);
        
        int carry = 0;
        while(first!= null && second != null){
            int sum = first.data + second.data + carry;
            if(sum>9){
                carry = 1;
            }else{
                carry = 0;
            }
            Node node = new Node(sum%10);
            if(head == null){
                head = node;
            }
            else{
                node.next = head;
                head = node;
            }
            first = first.next;
            second = second.next;
        }
        while(first != null){
            int sum = first.data + carry;
            if(sum>9){
                carry = 1;
            }else{
                carry = 0;
            }
            Node node = new Node(sum%10);
            if(head == null){
                head = node;
            }
            else{
                node.next = head;
                head = node;
            }
            first = first.next;
        }
        while(second != null){
            int sum = second.data + carry;
            if(sum>9){
                carry = 1;
            }else{
                carry = 0;
            }
            Node node = new Node(sum%10);
            if(head == null){
                head = node;
            }
            else{
                node.next = head;
                head = node;
            }
            second = second.next;
        }
        if(carry == 1){
            Node node = new Node(carry);
            if(head == null){
                head = node;
            }
            else{
                node.next = head;
                head = node;
            }
        }
        return head;
    }
}
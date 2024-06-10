package DSA_WITH_JAVA.Most_Common_Problems.Linked_List_Basic_Problems;

import java.util.HashSet;



//Detect a cycle in a linked list using Hash Set



public class LLProblem1 {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    public void push(int data){
        Node new_Node=new Node(data);
        new_Node.next=head;
        head=new_Node;
    }

    public boolean detectCycle(Node head) {
        // Write your code here.
        HashSet<Node> set=new HashSet<>();
        while (head!=null) {
            if (set.contains(head)) {
                return true;
            }
            else{
                set.add(head);
            }
            head=head.next;
            
        }
        return false;
    }
    public static void main(String[] args) {
        //adding elements to the list
      LLProblem1 llist=new LLProblem1();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.head.next.next.next.next = llist.head;

        if(llist.detectCycle(llist.head)){
            System.out.println("Cycle Detected");
        }
        else{
            System.out.println("Cycle Not Detected");
        }
    }
}

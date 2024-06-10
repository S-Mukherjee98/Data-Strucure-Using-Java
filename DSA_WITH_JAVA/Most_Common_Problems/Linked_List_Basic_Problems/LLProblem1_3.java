package DSA_WITH_JAVA.Most_Common_Problems.Linked_List_Basic_Problems;

/*
 * flood's cycle detection algorithm is as follows:
 * 1.Initializa 2 pointers, slow and fast, at the head of the linked list.
 * 2.Move slow pointer one step and fast pointer two steps at a time.
 * 3.If fast pointer reaches the end of the list, then there is no cycle.
 * 4.If fast pointer and slow pointer meet at the same node, then there is a cycle.
 */


public class LLProblem1_3 {
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
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                return true;
            }
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

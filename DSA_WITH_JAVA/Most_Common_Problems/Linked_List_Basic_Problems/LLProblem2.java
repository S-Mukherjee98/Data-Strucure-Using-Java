package DSA_WITH_JAVA.Most_Common_Problems.Linked_List_Basic_Problems;

//Find the intersection point of two linked lists

public class LLProblem2 {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        // Write your code here.
        Node curr1=headA;
        Node curr2=headB;
        while (curr1!=null && curr2!=null) {
            curr1=curr1.next;
            curr2=curr2.next;
            if (curr1==curr2) {
                return curr1;
            }
            
        }
        return null;
    }
   

  
    public static void main(String[] args) {
        //Creating 2 Linked list
        LLProblem2 llist=new LLProblem2();
       

        Node head1=null;
        Node head2=null;

        head1=new Node(10);
        head1.next=new Node(15);
        head1.next.next=new Node(20);
        head1.next.next.next=new Node(25);
        head1.next.next.next.next=null;

        head2=new Node(5);
        head2.next=new Node(12);
        head2.next.next=head1.next.next;
        head2.next.next.next=null;

        Node intersection_node =llist.getIntersectionNode(head1,head2);
        if (intersection_node!=null) {
            System.out.println("Intersection Node is "+intersection_node.data);
        }
        else{
            System.out.println("No Intersection Node");
        }


    }
}

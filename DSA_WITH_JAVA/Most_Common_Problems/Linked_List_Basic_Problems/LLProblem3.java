package DSA_WITH_JAVA.Most_Common_Problems.Linked_List_Basic_Problems;

// Reverse a linked list in groups of k.

public class LLProblem3 {
    Node head;
        class Node{
            int data;
            Node next;
            public Node(int data) {
                this.data=data;
                this.next=null;
            }
        }

        public void push(int data){
            Node new_Node=new Node(data);
            new_Node.next=head;
            head=new_Node;
        }

        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }



        public Node reverse(Node head, int k) {

            Node prev=null;
            Node current=head;
            Node next=null;
            int count=0;
            while(count<k && current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
                count++;
            }

            if (next!=null){
                head.next=reverse(next, k);
            }
            return prev;
        }

    public static void main(String[] args) {

        LLProblem3 llist=new LLProblem3();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.push(11);
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.display();
        System.out.println("Reversed Linked List");
        llist.head=llist.reverse(llist.head, 2);
        llist.display();
        
    }
    
}

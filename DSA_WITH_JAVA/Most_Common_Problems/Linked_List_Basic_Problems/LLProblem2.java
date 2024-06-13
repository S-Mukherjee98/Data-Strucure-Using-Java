package DSA_WITH_JAVA.Most_Common_Problems.Linked_List_Basic_Problems;

//Find the intersection point of two linked lists

import java.util.HashSet;





public class LLProblem2 {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    /*
 * In this apprach the time complexity of the algorithm is O(m*n)
 * where m and n are the lengths of the two linked lists.
 */
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


    //Find intersection of two linked lists using hash set
    //Time complexity is O(n) where n is the length of longer linked list.
    public Node getIntersectionNode2(Node headA, Node headB ){
        HashSet<Node> hs=new HashSet<Node>();
        while (headA!=null) {
            hs.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(hs.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
   
    

    public int getCount(Node head){
        int count=0;
        while (head!=null) {
            count++;
            head=head.next;
        }
        return count;
    }

    public Node getIntersectionNodeMostEfficient(Node node1, Node node2){
        while(node1!=null && node2!=null){
            if(node1==node2) return node1;
            node1=node1.next;
            node2=node2.next;
        }
        return null;
    }

    
    public Node getNode(Node head1,Node head2){
        int l1=getCount(head1);
        int l2=getCount(head2);
        System.out.println(l1+" "+l2);

        if(l1>l2){
            int d1=l1-l2;
            while(head1!=null){
                if(d1==0) return getIntersectionNodeMostEfficient(head1, head2);
                else{
                    head1=head1.next;
                    d1--;
                }
            }
            return null;
        }
        else{
            int d2=l2-l1;
            while(head2!=null){
                if(d2==0) return getIntersectionNodeMostEfficient(head1,head2);
                else{
                    head2=head2.next;
                    d2--;
                }
            }
            return null;
        }
    }
  
    public static void main(String[] args) {
        //Creating 2 Linked list
        LLProblem2 llist=new LLProblem2();
       

        Node head1=null;
        Node head2=null;

        head1=new Node(10);
        head1.next=new Node(15);
        head1.next.next=new Node(20);
        
       

        head2=new Node(5);
        head2.next=new Node(12);
        head2.next.next=new Node(30);
        head2.next.next.next=head1.next; 
       

        

        Node intersection_node =llist.getNode(head1,head2);
        if (intersection_node!=null) {
            System.out.println("Intersection Node is "+intersection_node.data);
        }
        else{
            System.out.println("No Intersection Node");
        }


    }
}

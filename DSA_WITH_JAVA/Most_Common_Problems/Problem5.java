package DSA_WITH_JAVA.Most_Common_Problems;

import java.util.Scanner;

public class Problem5 {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
        
    }
    Node head=null;

    public void create(){
        int n,data;
        Scanner sc =new Scanner(System.in);
        do {

            System.out.println("Enter The Data You want to insert: ");
            data=sc.nextInt();
            Node newNode=new Node(data);
            if (head==null) {
                head=newNode;
            }
            else{
                Node temp=head;
                while (temp.next!=null) { 
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            
            System.out.println("If you want to Insert More data Press 1 else any other Number: ");
            n=sc.nextInt();

        } while (n==1);
    }

    public void reverse(){
        Node Current=head;
        Node Prev=null;
        Node Next=null;
        while(Current!=null){
            Next=Current.next;
            Current.next=Prev;
            Prev=Current;
            Current=Next;
            
        }
        head=Prev;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("No node found for traversal");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("---> " + temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Problem5 ll=new Problem5();
        ll.create();
        ll.traverse();
        ll.reverse();
        ll.traverse();
    }


}

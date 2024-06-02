package DSA_WITH_JAVA.Linked_List;

import java.util.Scanner;

public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head=null;

    public void creation(){

        int data,n;
        try (Scanner sc = new Scanner(System.in)) {

            do { 
            System.out.println("Enter The Data of The Node: ");
            data=sc.nextInt();
            Node newNode = new Node(data);

            if (head==null){
                head=newNode;
            }
            else{
                System.out.println("1.Insert At Begining\n2.Insert At The End\n3.Insert At Specific Position\n\nEnter Your Choice: ");
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        newNode.next=head;
                        head=newNode;
                        break;
                    case 2:
                        Node temp=head;
                        while (temp.next !=null) {
                            temp=temp.next;
                        }
                        temp.next=newNode;
                        break;
                    case 3:
                        System.out.println("Enter The Position where you want to insert The new node : ");
                        int pos=sc.nextInt();
                        Node temp2=head;
                        for (int i = 0; i < pos-2; i++) {
                            temp2=temp2.next;
                        }
                        newNode.next=temp2.next;
                        temp2.next=newNode;
                        break;
                
                    default:
                        break;
                }
            }

            System.out.println("Do you want to continiue to add more ? Then press 1 else press any number: ");

            n=sc.nextInt();
            } while (n==1);

            
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public void traverse(){
        try {

            if (head==null) {
                System.out.println("No node found for traversal");
            }
            else{
                Node temp=head;
                while (temp!=null) {
                    System.out.print("---> "+temp.data);
                    temp=temp.next;
                }
            }
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
        SinglyLinkedList ll=new SinglyLinkedList();
        ll.creation();
        ll.traverse();
    }
}

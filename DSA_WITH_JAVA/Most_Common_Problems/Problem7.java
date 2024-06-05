package DSA_WITH_JAVA.Most_Common_Problems;

// Implement a stack using linked list.

import java.util.Scanner;




public class Problem7 {

    static class Node{

        int data;
        Node next;

        public Node(int data) {

            this.data=data;
            this.next=null;
        }
    }

    Node head=null;
    
    public void push(){

            int n,data;
            Scanner sc = new Scanner(System.in);
           


            do {
                System.out.println("Enter The Element: ");
                data=sc.nextInt();
                Node newNode= new Node(data);
                if (head==null) {
                    head=newNode;
                }

                else{
                    newNode.next=head;
                    head=newNode;
                }
                System.out.println("Do you want to continue pushing ? Then Press 1: ");
                n=sc.nextInt();
            } while (n==1);
    }


    public void pop(){


        int n;

            Scanner sc = new Scanner(System.in);
           
            do {
                
                if (head==null) {
                    System.out.println("Stack is empty totally");
                }

                else if (head.next==null) {
                    head=null;
                }
                else{
                    Node temp;
                    temp=head;
                    head=head.next;
                    temp.next=null;
                    System.out.println("Popped Item: "+temp.data);


                }
                System.out.println("Do you want to continue popping ? Then Press 1: ");
                n=sc.nextInt();
            } while (n==1);

    }

    public void peak(){
        if (head==null) {
            System.out.println("There is no element in stack");
        }
        else{
            System.out.println("Peak : "+head.data);
        }
    }

    public static void main(String[] args) {
        Problem7 stack=new Problem7();
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            stack.push();
            stack.peak();
            stack.pop();
            stack.peak();
            System.out.println("Do you want to continue? ");
            n=sc.nextInt();
        } while (n==1);
        sc.close();
    }

}

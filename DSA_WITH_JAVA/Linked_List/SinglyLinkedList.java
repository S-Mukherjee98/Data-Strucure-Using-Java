package DSA_WITH_JAVA.Linked_List;

import java.util.Scanner;

public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter The Data of The Node: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer:");
                sc.next();
            }
            data = sc.nextInt();
            sc.nextLine();  // Clear the buffer
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                System.out.println(
                        "1. Insert At Beginning\n2. Insert At The End\n3. Insert At Specific Position\n\nEnter Your Choice: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid choice:");
                    sc.next();
                }
                int choice = sc.nextInt();
                sc.nextLine();  // Clear the buffer
                switch (choice) {
                    case 1:
                        newNode.next = head;
                        head = newNode;
                        break;
                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = newNode;
                        break;
                    case 3:
                        System.out.println("Enter The Position where you want to insert the new node: ");
                       
                        int pos = sc.nextInt();
                        sc.nextLine();  // Clear the buffer
                        if (pos == 1) {
                            newNode.next = head;
                            head = newNode;
                        } else {
                            Node temp2 = head;
                            for (int i = 1; i < pos - 1 && temp2 != null; i++) {
                                temp2 = temp2.next;
                            }
                            if (temp2 != null) {
                                newNode.next = temp2.next;
                                temp2.next = newNode;
                            } else {
                                System.out.println("Invalid position.");
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }

            System.out.println("Do you want to continue to add more? Then press 1 else press any number: ");
          
            n = sc.nextInt();
            sc.nextLine();  // Clear the buffer
        } while (n == 1);
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);

        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            int n;
            do {
                System.out.println(
                        "1. Delete At Beginning\n2. Delete At End\n3. Delete At Particular Position\nEnter Your Choice: ");
              
                int ch = sc.nextInt();
                //sc.nextLine();  // Clear the buffer
                switch (ch) {
                    case 1:
                        if (head != null) {
                            Node temp = head;
                            head = head.next;
                            temp.next = null;
                        } else {
                            System.out.println("List is empty.");
                        }
                        break;
                    case 2:
                        if (head == null) {
                            System.out.println("List is empty.");
                        } else if (head.next == null) {
                            head = null;
                        } else {
                            Node temp1 = head;
                            while (temp1.next.next != null) {
                                temp1 = temp1.next;
                            }
                            temp1.next = null;
                        }
                        break;
                    case 3:
                        System.out.println("Enter the position you want to delete: ");
                       
                        int pos = sc.nextInt();
                        sc.nextLine();  // Clear the buffer
                        if (pos == 1 && head != null) {
                            Node temp2 = head;
                            head = head.next;
                            temp2.next = null;
                        } else {
                            Node temp2 = head;
                            for (int i = 1; i < pos - 1 && temp2 != null; i++) {
                                temp2 = temp2.next;
                            }
                            if (temp2 != null && temp2.next != null) {
                                Node delNode = temp2.next;
                                temp2.next = delNode.next;
                                delNode.next = null;
                            } else {
                                System.out.println("Invalid position or list is empty.");
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }

                System.out.println(
                        "Do you want to continue deletion operation? Then press 1 otherwise press any key: ");
               
                n = sc.nextInt();
                sc.nextLine();  // Clear the buffer
            } while (n == 1);
        }
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
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.creation();
        ll.traverse();
        ll.delete();
        ll.traverse();
    }
}

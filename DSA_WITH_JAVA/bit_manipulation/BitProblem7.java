

/*
 * 
 * Toggle the  i th bit . 
say for example:

10 -----> 1010  if i = 1

output: 1000 ----> 8
 */


 import java.util.Scanner;


 public class BitProblem7 {
     public static void main(String[] args) {
         System.out.println("Enter The Number : ");
         Scanner sc = new Scanner(System.in);
         
         int number = sc.nextInt();
         System.out.println("Enter i value : ");
         int i=sc.nextInt();
         int res=toggle(number,i);
         System.out.println(res);
         
         
     }
     
     public static int toggle(int number,int i ){
         return number ^ (1<<i);
     }
 }
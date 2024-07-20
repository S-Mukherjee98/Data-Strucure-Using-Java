

/*
 * Determine whther an integer is power of 2 or no
 */


 import java.util.Scanner;

 /*
 if it is a power of 2 then it will be like 10 or 100 or 1000 and binary form of the just previous digit of n, means n-1 will all 1. Like 11 or 111 or 1111
 
 so we will check for the previous digit and will perform a AND operation 
 like n & n-1 and if it is power of 2 it will always return 0
 */
 
 public class BitProblem6 {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Number : ");
         int num= sc.nextInt();
         
         boolean res=isPower(num);
         System.out.println(res);
         
     }
     
     public static boolean isPower(int num){
         if (num <= 0)return false;
         
         return (num & (num-1))==0;
         
     }
     
 }

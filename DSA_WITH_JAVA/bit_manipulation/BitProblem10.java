package bit_manipulation;


/*
 * 
 * check whether the number is odd or even
 6 --bin-> 110  7--bin-->111     8--bin-->1000       9--bin-->1001
      ! so remember that in a odd number always the last bit will be 1
      and for even last bit will be 0

      so to count the 1 in a binary number we can determine the set bit like below

      so if we do 13 or 7 or 9 or 5 (the odd numbers) & 1 then what it will do ?

      7--bin--> 111 & 001 ----> 1
      5--bin--> 101 & 001 ----> 1
      9--bin--> 1001 & 0001----> 1
      13--bin--> 1101 & 0001 ----> 1


      And for even number 

      6--bin-->110 & 001 ---> 0
      8--bin-->1000 & 0001 ---> 0
      10--bin-->1010 & 0001 ---> 0
 */


 import java.util.Scanner;


 public class BitProblem10 {
     public static void main(String[] args) {
         System.out.println("Enter The Number : ");
         Scanner sc = new Scanner(System.in);
         
         int number = sc.nextInt();
         
         String res=oddEvenCheck(number);
         System.out.println(res);
     }
     
     public static String oddEvenCheck(int number ){
         
        if((number & 1)==1) return "The Number is Odd";
        return "The Number is Even";
     }
 }
package bit_manipulation;



/*
 * Count the set bit in a number ::
10---binary-->1010

output=2
 */

 import java.util.Scanner;


 public class BitProblem9 {
     public static void main(String[] args) {
         System.out.println("Enter The Number : ");
         Scanner sc = new Scanner(System.in);
         
         int number = sc.nextInt();
         
         int res=countSetBit(number);
         System.out.println(res);
     }
     
     public static int countSetBit(int number ){
         int count=0;
         int remainder=0;
         while(number>0){
             remainder=number%2;
             if(remainder==1)count++;
             number/=2;
         }
         return count;
     }

     /*
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


      ! so we can get to know what is the last bit and after that we can perform the right shift operation by 1 
      ! and we will increase the value of count only when the & operation gives the value as 1
      
        number & 1
        number>>1

        implemented the function below

      */

     //little bit faster

      public static int countSetBit2(int number ){
        int count=0;
        
        while(number>0){
            if ((number & 1) ==1)count++;
            number=number>>1;
        }
        return count;
    }
 }

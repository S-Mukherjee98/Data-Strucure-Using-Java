package bit_manipulation;

import java.util.Scanner;

/*
 * problem 11

minimum bit flips to convert a number 
start=10  goal=7

10--bin--> 1010
7--bin-->0111

if we do the xor between start ^ goal

total flips=3
 */







 public class BitProblem11 {
    public static void main(String[] args) {
        System.out.println("Enter The Start : ");
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        System.out.println("Enter The Goal: ");
        int goal=sc.nextInt();
        
        
        int number=minimumBitFlips(start,goal);
        int res=countSetBit(number);
        System.out.println(res);
    }
    
    public static int minimumBitFlips(int start, int goal ){
       return (start ^ goal);
    }
    public static int countSetBit(int number){
        int count = 0;
        while(number>0){
            if ((number&1)==1)count++;
            number=number>>1;
        }
        return count;
    }
}

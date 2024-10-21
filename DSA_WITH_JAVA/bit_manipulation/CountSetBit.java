//count the set bit in a number  

// if 5 -- > 101 output: 2

import java.util.*;

public class CountSetBit {
    public static void main(String [] args){
        System.out.println("Enter The Number : ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        countSetBits(num);
    }
    
    public static void countSetBits(int num){
        int count=0;
        while(num>0){
            num=num&(num-1);
            count++;
        }
        System.out.println("Count of set bit : "+count);
    }
}

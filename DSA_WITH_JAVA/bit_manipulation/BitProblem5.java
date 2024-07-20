

import  java.util.*;

/*
Count the Number of 1s in a Binary Representation (Hamming Weight) 

count the number of 1

*/




public class BitProblem5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num=sc.nextInt();
        int res=countOne(num);
        System.out.println("The count of number is : "+res);
    }
    
    public static int countOne(int num){
        int count = 0;
        while(num!=0){
            if((num & 1) ==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
}

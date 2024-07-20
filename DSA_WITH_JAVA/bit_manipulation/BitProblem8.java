/*
 * Remove the last set bit

means 

if 10 ---> 1010  
it will become 1000=8


lets discuss

n=16 --binary----> 10000         n=40 --binary--> 101000         n=84 --binary-->   1010100
n-1=15 --binary--> 01111       n-1=39 --binary--> 100111      n-1=83 --binary-->    1010011


just look at the pair. figure out the pattern 
1st one from left is getting 0 and after that to right side all are 0 are getting 1

if do n & n-1 then it will just remove the last set bit to 0

 */




import java.util.Scanner;


public class BitProblem8 {
    public static void main(String[] args) {
        System.out.println("Enter The Number : ");
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        int res=removeLastSetBit(number);
        System.out.println(res);
    }
    
    public static int removeLastSetBit(int number ){
        return (number & (number-1));
    }
}







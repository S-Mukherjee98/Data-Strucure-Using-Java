package recursion;

//power of a number 

import java.util.Scanner;

class RecProblem8{
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int value= sc.nextInt();
        System.out.println("Enter the power: ");
        int n= sc.nextInt();
        int res=power(value , n);
        System.out.print(res);
    }
    
    public static int power(int value, int n){
        if(n<1)return 1;
        return value*power(value,n-1);
    }
    
}

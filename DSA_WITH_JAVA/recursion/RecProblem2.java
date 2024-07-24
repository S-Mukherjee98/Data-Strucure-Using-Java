package recursion;



//Print n number from n to 1

import java.util.Scanner;

class RecProblem2{
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Value Of n : ");
        int n= sc.nextInt();
        printNumbers(n);
    }
    
    public static void printNumbers(int n){
        
        if(n==0){
            return;
        }
        else{
           System.out.println(n);
           n--;
           printNumbers(n);
        }
    }
    
}

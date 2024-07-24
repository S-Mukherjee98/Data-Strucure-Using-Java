
//print 1 to n using java

import java.util.Scanner;

class RecProblem1{
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Value Of n : ");
        int n= sc.nextInt();
        int i=1;
        printNumbers(n,i);
    }
    
    public static void printNumbers(int n, int i){
        
        if(i>n){
            return;
        }
        else{
           System.out.println(i);
           i++;
           printNumbers(n,i);
        }
    }
    
}

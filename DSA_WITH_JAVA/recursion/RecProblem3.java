package recursion;


//sum of n number using 


import java.util.Scanner;

class RecProblem3{
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Value Of n : ");
        int n= sc.nextInt();
        System.out.println(sum(n));
    }
    
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    
}
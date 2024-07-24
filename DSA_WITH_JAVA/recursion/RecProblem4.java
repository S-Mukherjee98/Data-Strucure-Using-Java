package recursion;


//factorial of n


import java.util.Scanner;

class RecProblem4{
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Value Of n : ");
        int n= sc.nextInt();
        System.out.println(fact(n));
    }
    
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    
}

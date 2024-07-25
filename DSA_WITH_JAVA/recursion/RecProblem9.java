package recursion;


//print 1 to N number using recursion ----> Backtracking 



import java.util.Scanner;

class RecProblem9{
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= sc.nextInt();
        
        print(n);
        
    }
    
    public static void print(int n){
        if(n<1)return;
        print(n-1);
        System.out.println(n);
    }
    
}

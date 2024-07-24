package recursion;

import java.util.Scanner;


//fibonacci series



class RecProblem5{
    
    //fibonacci series
    // 0 1 1 2 3 5 8 13
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Value Of n : ");
        int n= sc.nextInt();
        // fibonacci( n);
        
        //recursive
        for(int i=0; i<n; i++){
            System.out.print(recFibo(i)+" ");
        }
    }
    
    
    //using normal for loop
    public static void fibonacci(int n){
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        int c;
        for(int i =0; i<n-2 ; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    
    //recursive fibonacci
    public static int recFibo(int n){
        if (n==0)return 0;
        else if(n==1)return 1;
        else{
            return recFibo(n-1)+recFibo(n-2);
        }
    }
    
}

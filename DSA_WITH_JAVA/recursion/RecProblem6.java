package recursion;


//reverse a string using recursion

import java.util.Scanner;

class RecProblem6{
 
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str= sc.next();
        int l=str.length();
        //recursive
        String rev=revString(str,l-1);
        System.out.println(rev);
    }
    
    public static String revString(String str,int i){
        
        
        if(i<0)return "";
        return str.charAt(i)+revString(str,i-1);
    }
    
}

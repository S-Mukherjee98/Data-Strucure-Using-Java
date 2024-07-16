package DSA_WITH_JAVA.bit_manipulation;

import java.lang.*;
import java.util.*;
class BinaryToDecimal{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        String bin=sc.next();
        double dec=binaryToDecimal(bin);
        System.out.println(dec);
        
    }
    
   public static double binaryToDecimal(String str){
       int l=str.length();
       double number=0;
       int power=0;
       for(int i=l-1;i>=0;i--){
           if(str.charAt(i)=='1'){
               number=number+Math.pow(2,power);
           }
           power++;
           
       }
       return number;
   }
}

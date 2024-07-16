package DSA_WITH_JAVA.bit_manipulation;

import java.util.Scanner;


//Convert a decimal number to binary number
public class BitProblem1 {

    public static void main(String[] args) {
        // System.out.println("Enter The Decimal Number : ");
        System.out.println("Enter The Binary Number : ");
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String n = sc.next();
        // String bin=Integer.toBinaryString(n);
        // System.out.println(bin);
        // String bin = convertTOBinary(n);
        // int dec=binaryToDecimal(n);
        // System.out.println(dec);
        sc.close();


    }

    public static String convertTOBinary(int x ){
        if(x==0){
            return "0";
        }
        else{
            String result = "";
            while(x!=0){
                if(x%2==0){
                    result="0"+result;
                }
                else{
                    result="1"+result;
                }
                x=x/2;
            }
            return result;
        }
    }

    //binary to decimal

   
    
}

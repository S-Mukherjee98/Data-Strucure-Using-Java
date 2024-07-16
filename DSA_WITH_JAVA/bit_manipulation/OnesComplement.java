
import java.lang.*;
import java.util.*;
class OnesComplement{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        
        int dec=sc.nextInt();
        String bin=decimalToBinary(dec);
        String onesc=onesComplement(bin);
        System.out.println(bin);
        System.out.println(onesc);
        // System.out.println(dec);
    }
    
    
    public static String decimalToBinary(int dec){
        if (dec==0)return "0";
        String str="";
        while(dec>0){
            int remainder=dec%2;
            if(remainder==0){
                str="0"+str;
            }
            else{
                str="1"+str;
            }
            dec/=2;
        }
        return str;
    }
    
    public static String onesComplement(String bin){
        
        int l=bin.length();
        String ones="";
        for(int i=0;i<l;i++){
            if(bin.charAt(i)=='0'){
                ones=ones+"1";
            }
            else{
                ones=ones+"0";
            }
    }
    return ones;
   
}
}

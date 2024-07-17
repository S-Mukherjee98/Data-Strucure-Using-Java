
import java.util.Scanner;


//check the i th value is set or not. (set means the value is 1 or not)



public class BitProblem2 {

    public static void main(String[] args) {

        //common approach
            Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number ");
            // int value=sc.nextInt();
            // System.out.println("Enter the i th value");
            // int k=sc.nextInt();
            // String str=decimalToBinaryString(value);
            // System.out.println(str);
            // boolean isSet=commonApproach(str,k);
            // System.out.println(isSet);

        //naive approach
        System.out.println("Enter the number ");
        int value=sc.nextInt();
        System.out.println("Enter the i th value");
        int k=sc.nextInt();

        System.out.println(naiveApproach(value,k));

    }

    public static boolean  naiveApproach(int value, int k){

        //used the right shift operator to do this

        return ((value>>k) & 1)==1;
    }

    public static boolean commonApproach(String str,int k){

        int l=str.length();
        
        if (k >= l || k < 0) {
            return false; // out of bounds check
        } else {
            // Check the k-th bit from the right
            return str.charAt(l - k - 1) == '1';
        }
    }

    public static String decimalToBinaryString(int value){
        String str="";
        while(value > 0){
            int remainder=value%2;
            if(remainder==0){
                str="0"+str;
            }
            else{
                str="1"+str;
            }
            value/=2;
        }
        return str;
    }
    
}

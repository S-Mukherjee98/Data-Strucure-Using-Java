package recursion;

/*
 * Problem 11

**Interesting problem of backtracking

Convert Decimal to binary
 */
import java.util.Scanner;
class RecProblem11{
    public static void main(String[] args) {
        System.out.println("Enter the decimal number: ");
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        String bin="";
        String res=decToBin(num);
        System.out.println(res);
    }
    
    public static String decToBin(int num){
        if (num==0)return "0";
       
        return dToB(num,"");
    }
    
    public static String dToB(int num, String bin){
        if (num==0)return bin;
        return dToB(num/2,(num%2)+ bin);
    }
}
package bit_manipulation;


import java.util.*;

//check the 2 numbers are opposite in sign or same in sign

public class CheckOppositeSign {
    
    public static void main(String [] args){
        System.out.println("Enter The Value of a : ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("Enter The Value of b : ");
        int b =sc.nextInt();
        checkOpposite(a,b);
    }
    
    public static void checkOpposite(int a, int b){
        if((a^b) < 0){
            System.out.println("Opposite sign");
        }
        else{
            System.out.println("Same sign");
        }
    }
}

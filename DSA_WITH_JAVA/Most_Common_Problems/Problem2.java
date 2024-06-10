package DSA_WITH_JAVA.Most_Common_Problems;

import java.util.Scanner;

//Check wheather a string is palindrome or not 


public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        
        try (Scanner sc = new Scanner(System.in)) {
            
            String str=sc.next();
            System.out.println("The Given String Is : "+str);
            boolean res=checkPalindrome(str); 
            if(res)System.out.println("Given String is Palindrome");
            else System.out.println("Given String is not Palindrome");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static boolean checkPalindrome(String str) throws Exception{

        try {

            int start=0,end=str.length() -1;

            while (start<end) { 
                if(str.charAt(start)!=str.charAt(end)) return false;
                start++;
                end--;
            }
            return true;
            
        } catch (Exception e) {
            return false;
        }

        
        
    }
}

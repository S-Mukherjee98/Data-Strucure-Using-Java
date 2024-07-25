package recursion;

//String is pallindrome or not using recursion




import java.util.Scanner;

class RecProblem7{
    
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str= sc.next();
        int l=str.length();
        //recursive
        int start=0;
        int end=str.length()-1;
        boolean res=isPallindrome(str,start,end);
        System.out.println(res);
    }
    
    public static boolean isPallindrome(String str, int start, int end){

        if(start>=end)return true;
        if(str.charAt(start)!=str.charAt(end))return false;
        return isPallindrome(str,start+1,end-1);
    }
    
}

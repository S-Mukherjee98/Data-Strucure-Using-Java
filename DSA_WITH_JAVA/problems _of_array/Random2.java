import  java.util.*;

/*
 Problem Description -:  Given two non-negative integers n1 and n2, where n1

For example:

Suppose n1=11 and n2=15.

There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.

Example1:

Input:

11 — Vlaue of n1
15 — value of n2
Output:

4
Example 2:

Input:

101 — value of n1
200 — value of n2
Output:

72
 */


class Random2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The 1st Number: ");
        int n1=sc.nextInt();
        System.out.println("Enter The 2nd Number: ");
        int n2=sc.nextInt();
        
        int count=countNonRepeatNumber(n1,n2);
        System.out.println(count);
        
    }
    
    public static int countNonRepeatNumber(int n1, int n2){
        int count=0;
        for(int i=n1;i<=n2;i++){
            if(isUnique(i)){
                count++;
            }
        }
        return count;
    }
    
    public static boolean isUnique(int number){
        boolean [] digit=new boolean[10];
        while(number>0){
            int visited = number%10;
            if(digit[visited]){
                return false;
            }
            digit[visited]=true;
            number/=10;
        }
        return true;
    }
}

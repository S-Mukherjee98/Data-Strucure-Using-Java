package DP.Problems.climbing stairs;

import java.util.*;



class ClimbingStairsTab {
    public static void main(String[] args) {
        System.out.println("Enter The Value n : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=climbingStairs(n);
        if(count==-1){
            System.out.println("Enter valid value of n");
        }
        System.out.println("Answer : "+count);
    }
    
    public static int climbingStairs(int n){
        if(n>0 && n<=2)return n;
        if(n<=0)return -1;
        int a=1;
        int b=2;
        int c=0;
        for(int i=2; i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
        
    }
}

package DP.Problems.climbing stairs;


import java.util.*;

//! Using Memoizaion

class ClimbingStairsMem {
    public static void main(String[] args) {
        System.out.println("Enter The Value n : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        int count=climbingStairs(n,dp);
        System.out.println("Answer : "+count);
    }
    
    public static int climbingStairs(int n, int[] dp){
        if(n<=2)return n;
        
        if(dp[n]>0)return dp[n];
        
        dp[n]=climbingStairs(n-1,dp)+climbingStairs(n-2,dp);
        return dp[n];
    }
}

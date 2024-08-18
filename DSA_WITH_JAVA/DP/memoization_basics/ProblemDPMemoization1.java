package DP.memoization_basics;

import java.util.*;

// Dp problem
//fibonacci series print using memoization 

class ProblemDPMemoization1{
    
    public static void main(String [] args){
        System.out.println("Enter The Value N : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] dp = new int[n+1];
        for(int i = 0 ; i<n+1; i++){
            dp[i]=-1;
        }
        for(int i =0; i<n; i++){
           int number=function(i,dp); 
           System.out.print(i+" ");
        }
        
    }
    
    public static int function(int n, int [] dp){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        int element = function(n-1,dp)+function(n-2,dp);
        dp[n]=element;
        return element;
    }
}
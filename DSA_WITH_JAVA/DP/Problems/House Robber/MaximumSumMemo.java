package DP.Problems.House Robber;

import java.util.*;

//Maximum Sum of Non-Adjacent Elements | House Robber | 1-D 
// used memoization technique

class MaximumSumMemo{
    
    public static void main(String [] args){
      System.out.println("Enter The Size of The Array : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter All Elements one by one : ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int res = maxSum(arr,n);
    System.out.println("the answer is : "+res);
    }
    
    public static int maxSum(int[] arr, int n){
        int [] dp = new int[n];
        Arrays.fill(dp, -1);
        return calculate(n-1,arr,n,dp);
        
    }
    
    public static int calculate(int index , int [] arr , int n, int [] dp){
        if (index==0)return arr[index];  
        if (index<0) return 0;
        if (dp[index]!=-1)return dp[index];
        int pick = arr[index] + calculate(index-2,arr,n,dp);
        int nonPick = 0 + calculate(index-1,arr,n,dp);
        dp[index] = Math.max(pick,nonPick);
        return dp[index];
    }
    
}

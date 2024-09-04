package DP.Problems.House Robber;

import java.util.*;

//Maximum Sum of Non-Adjacent Elements | House Robber | 1-D 
// used memoization technique

class MaximumSumTabulation{
    
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
        // Arrays.fill(dp, -1);
        return calculate(arr,n,dp);
        
    }
    
    public static int calculate( int [] arr , int n, int [] dp){
        dp[0]=arr[0];
        int neg=0;
        for(int index=1;index<n;index++){
            int pick = arr[index];
            if(index>1){
             pick += dp[index-2];   
            }
            
            int nonPick = 0 + dp[index-1];
            dp[index]=Math.max(pick,nonPick);
        }
        return dp[n-1];
    }
    
}

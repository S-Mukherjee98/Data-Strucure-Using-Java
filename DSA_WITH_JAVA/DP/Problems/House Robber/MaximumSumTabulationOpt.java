package DP.Problems.House Robber;

import java.util.*;

//Maximum Sum of Non-Adjacent Elements | House Robber | 1-D 
// used memoization technique

/*
 Enter The Size of The Array : 
4
Enter All Elements one by one : 
2 1 4 9
the answer is : 11
 */

class MaximumSumTabulationOpt{
    
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
        if(n==0)return 0;
        if(n==1)return 1;
        
        // Arrays.fill(dp, -1);
        return calculate(arr,n,dp);
        
    }
    
    public static int calculate( int [] arr , int n, int [] dp){
        int prev2=0;  // This represents dp[index-2]
        int prev1 =arr[0];  // This represents dp[index-1]
        for(int index=1;index<n;index++){
            int pick = arr[index];
            if(index>1){
             pick += prev2;   
            }
            
            int nonPick =  prev1;
            int current =Math.max(pick,nonPick);
            prev2 = prev1;
            prev1=current;
            
        }
        return prev1;
    }
    
}

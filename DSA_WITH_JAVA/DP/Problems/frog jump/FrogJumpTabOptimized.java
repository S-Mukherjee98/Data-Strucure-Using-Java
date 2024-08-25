package DP.Problems.frog jump;


//space optimized for tabulation

import java.util.*;

//bottom up approach

class FrogJumpTabOptimized {
    public static void main(String[] args) {
        System.out.println("Enter The Value n : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] cost =  new int[n];
      
        
        System.out.println("Enter The Cost : ");
        for(int i = 0; i<n; i++){
            cost[i]=sc.nextInt();
        }
        int res = frogJump(n-1,cost);
        System.out.println(res);
    }
    
    //calculate the min height or energy
    public static int frogJump(int n,int[] cost){
        
        int prev1=0; // dp[i-1]
        int prev2=0; // dp[i-2]
        for(int i = 1; i<=n;i++){
            int jumpOne = prev1 + Math.abs(cost[i]-cost[i-1]);
            int jumpTwo=Integer.MAX_VALUE;
            if(i>1){
                jumpTwo=prev2 + Math.abs(cost[i]-cost[i-2]);
            }
            int current=Math.min(jumpOne,jumpTwo);
            prev2=prev1;
            prev1= current;
        }
        return prev1;
    }
}

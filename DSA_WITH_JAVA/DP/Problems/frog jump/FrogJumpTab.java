package DP.Problems.frog jump;

import java.util.*;

//bottom up approach

class FrogJumpTab {
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
        
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i = 1; i<=n;i++){
            int jumpOne = dp[i-1] + Math.abs(cost[i]-cost[i-1]);
            int jumpTwo=Integer.MAX_VALUE;
            if(i>1){
                jumpTwo=dp[i-2] + Math.abs(cost[i]-cost[i-2]);
            }
            dp[i]=Math.min(jumpOne,jumpTwo);
        }
        return dp[n];
    }
}
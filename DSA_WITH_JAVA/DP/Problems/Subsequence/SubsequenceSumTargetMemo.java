package DSA_WITH_JAVA.DP.Problems.Subsequence;


import java.util.*;
class Main {
    public static void SubsequenceSumTargetMemo(String[] args) {
        System.out.println("Enter The Size Of The Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter All Elements One By One : ");
        int [] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The Target : ");
        int target = sc.nextInt();
        int[][] dp = new int[n][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println("Result :"+func(n-1,target,arr,dp));
        
    }
    
    public static boolean func(int ind, int target, int [] arr, int [][] dp){
        
        if(target == 0)return true;
        if(ind<0)return false;
        if(dp[ind][target]!=-1)return dp[ind][target]==1;
        boolean nonTake=func(ind-1,target,arr,dp);
        boolean take=false;
        if(arr[ind]<=target){
            take = func(ind-1, target-arr[ind],arr,dp);
        }
        dp[ind][target] = (nonTake || take) ? 1 : 0;
        return dp[ind][target]==1;
        
    }
    
}

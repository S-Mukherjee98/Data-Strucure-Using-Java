// Minimum Grid Path with Memoization


import java.util.*;
class MinimumGridPathMemo {
    public static void main(String[] args) {
        System.out.println("Enter The Size of the Grid");
        System.out.println("Enter The Row Size: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter The column Size: ");
        int n = sc.nextInt();
        int [][] arr = new int [m][n];
        System.out.println("Enter All Elements One By One: ");
        for(int i =0 ; i<m ; i++){
            System.out.println("Enter The Elements For Row : "+i);
            for(int j=0; j<n; j++){
              arr[i][j]=sc.nextInt();  
            }
        }
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println("Minimum cost of the path: "+func(m-1,n-1,arr,dp));
        
    }
    
    public static int func(int i,int j, int [][] arr, int [][] dp){
        
        if(i==0 && j==0) return arr[0][0];
        if(i<0 || j<0)return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int up =  (i>0) ? func(i-1,j,arr,dp) : Integer.MAX_VALUE;
        int left = (j>0) ? func(i,j-1,arr,dp) : Integer.MAX_VALUE;
        dp[i][j]=arr[i][j] + Math.min(up,left);
        return dp[i][j];
    }
    
    
}

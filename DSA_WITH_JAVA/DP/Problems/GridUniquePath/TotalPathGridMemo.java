package DP.Problems.GridUniquePath;

import java.util.*;

class TotalPathGridMemo {
    public static void main(String[] args) {
        System.out.println("Enter The Total Number of rows: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter The Total Number of cols: ");
        int n = sc.nextInt();
        int [][]arr = new int [m][n];
        System.out.println("Enter The Elements of The 2D Array One by one: ");
        int i=0;
        int j=0;
        for(i=0; i<m;i++){
            System.out.println("Enter The Elements of The Row : "+i);
            for(j=0; j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int [][] dp = new int [m][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println("Total Number of Paths: "+func(m-1,n-1,dp));
    }

    public static int func(int i, int j, int [][] dp) {
        if(i==0 && j==0)return 1;
        if(i<0 || j<0)return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        int up=func(i,j-1,dp);
        int left=func(i-1,j,dp);
        
        dp[i][j]=up+left;
        return dp[i][j];
    }
}

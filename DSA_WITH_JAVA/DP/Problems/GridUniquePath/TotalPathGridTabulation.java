package DP.Problems.GridUniquePath;

import java.util.*;

class TotalPathGridTabulation {
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
        // int [][] dp = new int [m][n];
        // for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println("Total Number of Paths: "+func(m,n));
        
        
    }

    public static int func(int m, int n) {
        
        int [][] dp = new int[m][n];
        for(int i=0;i<m;i++)dp[i][0]=1;
        for(int j=0;j<m;j++)dp[0][j]=1;
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}

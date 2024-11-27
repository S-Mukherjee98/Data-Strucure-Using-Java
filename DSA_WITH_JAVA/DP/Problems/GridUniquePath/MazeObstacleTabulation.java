
import java.util.*;
class MazeObstacleTabulation {
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
        
        System.out.println("Total Number of Paths: "+func(m,n, arr));
    }
    
    public static int func(int m, int n, int [][]arr){
        int[][] dp = new int[m][n];
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if (arr[i][j] == -1) {
                    dp[i][j] = 0;
                    continue; 
                }
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue; 
                }
                else{
                    int up = (i > 0) ? dp[i - 1][j] : 0;  
                    int left = (j > 0) ? dp[i][j - 1] : 0;  
                    dp[i][j] = up + left; 
                }
            }
        }
        
        return dp[m-1][n-1];
        
    }
    
}
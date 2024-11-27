
/*
 We are given an “N*M” Maze. The maze contains some obstacles. A cell is ‘blockage’ in the maze if its value is -1. 0 represents non-blockage. There is no path possible through a blocked cell.

We need to count the total number of unique paths from the top-left corner of the maze to the bottom-right corner. At every cell, we can move either down or towards the right.
 */


/*
 For Example :
Consider the maze below :
0 0 0 
0 -1 0 
0 0 0

There are two ways to reach the bottom left corner - 

(1, 1) -> (1, 2) -> (1, 3) -> (2, 3) -> (3, 3)
(1, 1) -> (2, 1) -> (3, 1) -> (3, 2) -> (3, 3)

Hence the answer for the above test case is 2.
 */



import java.util.*;
class MazeObstacleRec {
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
        System.out.println("Total Number of Paths: "+func(m-1,n-1, arr));
    }
    
    public static int func(int i, int j, int [][]arr){
        if(i<0 || j<0 )return 0;
        if(i==0 && j==0)return 1;
        if(i>=0 && j>=0 && arr[i][j]==-1)return 0;
        int up=func(i-1,j,arr);
        int left = func(i,j-1,arr);
        return up + left;
        
    }
    
}
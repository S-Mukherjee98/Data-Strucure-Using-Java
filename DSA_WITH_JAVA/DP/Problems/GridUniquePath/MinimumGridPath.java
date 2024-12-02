
// Minimum Grid Path



//Print all the subsequence of the array
import java.util.*;
class MinimumGridPath {
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
        System.out.println("Minimum cost of the path: "+func(m-1,n-1,arr));
        
    }
    
    public static int func(int i,int j, int [][] arr){
        
        if(i==0 && j==0) return arr[0][0];
        if(i<0 || j<0)return Integer.MAX_VALUE;
        
        int up =  (i>0) ? func(i-1,j,arr) : Integer.MAX_VALUE;
        int left = (j>0) ? func(i,j-1,arr) : Integer.MAX_VALUE;
        return arr[i][j] + Math.min(up,left);
    }
    
    
}



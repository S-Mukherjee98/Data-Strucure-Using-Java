package DP.Problems.House Robber;

import java.util.*;

//Maximum Sum of Non-Adjacent Elements | House Robber | 1-D 
// Input: arr[] = {3, 2, 7, 10}
// Output: 13

class MaximumSum{
    
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
        
        return calculate(n-1,arr,n);
    }
    
    public static int calculate(int index , int [] arr , int n){
        if (index==0) return arr[index];
        if (index<0) return 0;
        int pick = arr[index] + calculate(index-2,arr,n);
        int nonPick = 0 + calculate(index-1,arr,n);
        int res = Math.max(pick,nonPick);
        return res;
    }
    
}

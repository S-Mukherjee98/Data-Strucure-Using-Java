package DP.Problems.frog jump;

import java.util.*;
//kth jump possible

class FrogJumpVariable{
    public static void main(String [] args){
        System.out.print("Enter The Value Of N: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter The Value K : ");
        int k= sc.nextInt();
        System.out.println("Enter all elements one by one : ");
        int [] arr = new int [n];
        for(int i=0;i<n; i++)arr[i]=sc.nextInt();
        System.out.println("The minimum energy : "+ frog(arr,n-1,k));
    }
    public static int frog(int [] arr , int n, int k){
        if(n==0)return 0;
        int minSteps=Integer.MAX_VALUE;
        int jump=Integer.MAX_VALUE;
        for (int j=1; j<=k ; j++){
            if(n-j>=0)jump = frog(arr,n-j,k) + Math.abs(arr[n]-arr[n-j]);
            minSteps=Math.min(minSteps,jump);
        }
        
        return minSteps;
    }
}

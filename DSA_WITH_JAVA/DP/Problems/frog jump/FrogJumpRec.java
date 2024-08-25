package DP.Problems.frog jump;


/*
 
Problem Statement:

Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair. At a time the frog can climb either one or two steps. A height[N] array is also given. Whenever the frog jumps from a stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the absolute difference. We need to return the minimum energy that can be used by the frog to jump from stair 0 to stair N-1.
 */



 import java.util.*;

 //Top down approach using recursion
 
 class FrogJumpRec {
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
         if(n==0)return 0;
         
         int left = frogJump(n-1,cost)+Math.abs(cost[n]-cost[n-1]);
         int right=Integer.MAX_VALUE;
         if(n>1){
           right = frogJump(n-2,cost)+Math.abs(cost[n]-cost[n-2]);  
         }
         return Math.min(left,right);
         
     }
 }
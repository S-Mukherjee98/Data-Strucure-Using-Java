package DP.Problems.House Robber;

/*
Problem statement
Mr. X is a professional robber planning to rob houses along a street. Each house has a certain amount of money hidden.



All houses along this street are arranged in a circle. That means the first house is the neighbour of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses are broken into on the same night.



You are given an array/list of non-negative integers 'ARR' representing the amount of money of each house. Your task is to return the maximum amount of money Mr. X can rob tonight without alerting the police.



Note:
It is possible for Mr. X to rob the same amount of money by looting two different sets of houses. Just print the maximum possible robbed amount, irrespective of sets of houses robbed.


For example:
(i) Given the input array arr[] = {2, 3, 2} the output will be 3 because Mr X cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses. So, he’ll rob only house 2 (money = 3)

(ii) Given the input array arr[] = {1, 2, 3, 1} the output will be 4 because Mr X rob house 1 (money = 1) and then rob house 3 (money = 3).

(iii) Given the input array arr[] = {0} the output will be 0 because Mr. X has got nothing to rob.
 */


import java.util.*;

class HouseRobber2{
    
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
       
        if(n==0)return 0;
        if(n==1)return 1;
        
        // Arrays.fill(dp, -1);
        //considering the 1st element then can not choose the last one
        int temp1[]=Arrays.copyOfRange(arr,0,n-1);
        //considering the last element then can not choose the 1st one
        int temp2[]=Arrays.copyOfRange(arr,1,n);
        
        return Math.max(calculate(temp1),calculate(temp2));
        
    }
    
    public static int calculate( int [] arr ){
        int prev2=0;  // This represents dp[index-2]
        int prev1 =arr[0];  // This represents dp[index-1]
        for(int index=1;index<arr.length;index++){
            int pick = arr[index];
            if(index>1){
             pick += prev2;   
            }
            
            int nonPick =  prev1;
            int current =Math.max(pick,nonPick);
            prev2 = prev1;
            prev1=current;
            
        }
        return prev1;
    }
    
}

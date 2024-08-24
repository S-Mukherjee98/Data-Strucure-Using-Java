package DP.Problems.climbing stairs;

import java.util.*;


//!Normal Recursion

/*
 
Problem Statement
You are given a staircase with n steps. You can either climb 1 step or 2 steps at a time. The task is to determine the number of distinct ways you can climb to the top of the staircase.

Example
Input: n = 2

You can either climb 1 step + 1 step or take 2 steps at once.
Output: 2
Input: n = 3

Possible ways:
1 step + 1 step + 1 step
1 step + 2 steps
2 steps + 1 step
Output: 3
 */

class ClimbingStairs1 {
    public static void main(String[] args) {
        System.out.println("Enter The Value n : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=climbingStairs(n);
        System.out.println("Answer : "+count);
    }
    
    public static int climbingStairs(int n){
        if(n<=2)return n;
        return climbingStairs(n-1)+climbingStairs(n-2);
    }
}

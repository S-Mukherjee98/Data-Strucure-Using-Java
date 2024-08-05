/*
 Problem Statement: Given an array print all the sum of the subset generated from it, in the increasing order.

Example 1:

Input: N = 3, arr[] = {5,2,1}

Output: 0,1,2,3,5,6,7,8

Explanation: We have to find all the subset’s sum and print them.in this case the generated subsets are [ [], [1], [2], [2,1], [5], [5,1], [5,2]. [5,2,1],so the sums we get will be  0,1,2,3,5,6,7,8
 */

 import java.util.*;

 class ImpRecProblem8 {
     public static void main(String[] args) {
         System.out.println("Enter The Size Of The Array: ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter All Elements One By One: ");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         int index = 0;
         int sum = 0;
         List<Integer> res = new ArrayList<>();
         subSetSum(index, arr, sum, res);
         Collections.sort(res);
         System.out.println(res);
     }
 
     public static void subSetSum(int index, int[] arr, int sum, List<Integer> res) {
         if (index == arr.length) {
             res.add(sum);
             return;
         }
         subSetSum(index + 1, arr, sum + arr[index], res); // Include the current element
         subSetSum(index + 1, arr, sum, res); // Exclude the current element
     }
 }
 

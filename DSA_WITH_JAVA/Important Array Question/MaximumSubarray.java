package Important Array Question;

/*
 * maximum sum of a subarray 
 * Given the array [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * output : 6
 * 
 
Core Idea: The idea behind Kadane’s algorithm is that at every position in the array, you either:

Start a new subarray (if the previous subarray’s sum is negative or zero), or
Extend the existing subarray (if the previous subarray’s sum is positive).
Key Variables:

currentSum: Tracks the sum of the current subarray.
maxSum: Keeps track of the maximum sum encountered so far.
Steps:

Initialize currentSum to 0 and maxSum to the smallest possible integer (or the first element of the array).
Traverse the array:
Add the current element to currentSum.
If currentSum becomes greater than maxSum, update maxSum.
If currentSum becomes negative, reset it to 0 (because a negative sum will decrease any subsequent sums).
Continue this until the end of the array.



 */



 import java.util.*;

 public class MaximumSubarray {
     
     public static void main(String [] args){
         System.out.println("Enter The Size Of the Array : ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = new int [n];
         System.out.println("Enter All Elements One By One : ");
         for(int i = 0; i<n; i++){
             arr[i]=sc.nextInt();
         }
         
         maxSubarray(arr);
     }
     
     public static void maxSubarray(int [] arr){
         
         int currentSum=0;
         int maxSum = Integer.MIN_VALUE;
         
         for(int i=0; i<arr.length; i++){
             currentSum +=arr[i];
             
             if(currentSum>maxSum){
                 maxSum=currentSum;
             }
             
             if(currentSum<0){
                 currentSum=0;
             }
         }
         System.out.println(maxSum);
     }
 
 }
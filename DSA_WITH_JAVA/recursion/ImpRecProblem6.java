
/*
 
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
 */


 import java.util.*;

 class ImpRecProblem6{
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter The Size of The Array : ");
         int n= sc.nextInt();
         int [] arr = new int [n];
         System.out.println("Enter All Elements One By One : ");
         for(int i=0 ; i<n; i++){
             arr[i]=sc.nextInt();
         }
         System.out.println("Enter The Target : ");
         int target = sc.nextInt();
         List<Integer> current = new ArrayList<>();
         List<List<Integer>> res= combinationSum(arr,current,target);
         for(List<Integer> el : res){
             System.out.print(el+" ");
         }
     }
     
     public static List<List<Integer>> combinationSum(int [] arr , List<Integer> current, int target){
         List<List<Integer>> res=new ArrayList<>();
         recFunc(0,arr,current,target,res);
         return res;
     }
     
     public static void recFunc(int index,int [] arr, List<Integer> current , int target, List<List<Integer>> res){
         if (index==arr.length){
             if(target==0){
                 res.add(new ArrayList<>(current));
                 
             }
             return;
             
         }
         
         //pick 
         if(arr[index]<=target){
             current.add(arr[index]);
             recFunc(index,arr,current,target-arr[index],res);
             current.remove(current.size()-1);
         }
         recFunc(index+1,arr,current,target,res);
     }
     
 }

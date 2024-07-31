


/*
 

Level : Medium

Leet code : Problem 90 

Subset II

Given an integer array nums that may contain duplicates, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 */


// Directly used set data structre



 import java.util.*;

 class ImpRecProblem2{
     public static void main(String[] args) {
         System.out.println("Enter The Size of The Array");
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println("Enter all elements one by one");
         int [] arr = new int[n];
         for(int i = 0; i < n; i++){
             arr[i]=sc.nextInt();
         }
         int index=0;
         Set<List<Integer>> li = new HashSet<>();
         List<Integer> current= new ArrayList<>();
         Set<List<Integer>> res = subset(index,arr,current, li);
         for(List<Integer> el: res){
             System.out.print(el+" ");
         }
     }
     
     
     public static Set<List<Integer>> subset(int index, int [] arr, List<Integer> current , Set<List<Integer>> res){
         if (index >= arr.length){
             res.add(new ArrayList<>(current));
             return res;
         }
         
         current.add(arr[index]);
         subset(index+1,arr,current,res);
         
         current.remove(current.size()-1);
         subset(index+1,arr,current,res);
         
         return res;
         
     }
     
 }

/*
 * 
 Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 */




 import java.util.*;


 class ImpRecProblem7 {
     public static void main(String[] args) {
         System.out.println("Enter The Size Of The Array : ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = new int[n];
         System.out.println("Enter All Elements One By One : ");
         for (int i=0 ; i<n; i++){
             arr[i]=sc.nextInt();
         }
         System.out.println("Enter The Target : ");
         int target= sc.nextInt();
         
         List<Integer> ds = new ArrayList<>();
         List<List<Integer>>  res = combinationSum2(arr,target,ds);
         System.out.println(res);
     }
     
     public static List<List<Integer>> combinationSum2(int [] arr, int target, List<Integer> ds){
         List<List<Integer>> res= new ArrayList<>();
         Arrays.sort(arr);
         int index=0;
         findCombination(index, arr, target,ds,res);
         return res;
     }
     
     public static void findCombination(int index, int [] arr, int target, List<Integer> ds, List<List<Integer>> res){
         if(target == 0){
             res.add(new ArrayList<>(ds));
             return;
         }
         
         for(int i=index; i<arr.length; i++){
             if(i>index && arr[i]==arr[i-1]) continue;
             if(arr[i]>target) break;
             ds.add(arr[i]);
             findCombination(i+1, arr, target-arr[i],ds,res);
             ds.remove(ds.size()-1);
             
         }
     }
 }

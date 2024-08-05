/*
 
Print all the unique subset of an array

Using set

! Bruteforce technique
 */

 import java.util.*;

 class ImpRecProblem9{
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Size of the array: ");
         int n= sc.nextInt();
         int [] arr = new int[n];
         System.out.println("Enter All Elements One By One : ");
         for(int i=0; i<n; i++){
             arr[i]=sc.nextInt();
         }
         
         List<List<Integer>> res=generateUniqeSubset(arr);
         System.out.println(res);
     }
     
     public static List<List<Integer>> generateUniqeSubset(int [] arr){
         Set<List<Integer>> set = new HashSet<>();
         int index =0;
         List<Integer> current= new ArrayList<>();
         generate(index,current,arr,set);
         List<List<Integer>> li = new ArrayList<>();
         for(List<Integer> el : set){
             li.add(el);
         }
         return li;
     }
     
     public static void generate(int index,List<Integer> current, int [] arr, Set<List<Integer>> set){
         if(index==arr.length){
             set.add(new ArrayList<>(current));
             return;
         }
         current.add(arr[index]);
         generate(index+1,current , arr, set);
         current.remove(current.size()-1);
         generate(index+1,current,arr,set);
     }
 }

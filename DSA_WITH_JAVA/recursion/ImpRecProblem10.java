
/*
Print all the unique subset of an array
 */



 import java.util.*;

 class ImpRecProblem10{
     
     
     
     
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
         Arrays.sort(arr);
         List<List<Integer>> res = new ArrayList<>();
         int index =0;
         List<Integer> current= new ArrayList<>();
         generate(index,current,arr,res);
        return res;
     }
     
     public static void generate(int index,List<Integer> current, int [] arr, List<List<Integer>> res){
         
         res.add(new ArrayList<>(current));
        
         for(int i= index; i<arr.length; i++){
             if(i>index && arr[i]==arr[i-1])continue;
             current.add(arr[i]);
             generate(i+1,current,arr,res);
             current.remove(current.size()-1);
         }
     }
 }

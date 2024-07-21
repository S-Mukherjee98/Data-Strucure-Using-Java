package bit_manipulation;


/*
 * Problem 16

Find the single number 

given input arr=[1 1 2 3 3 4 5 5 ]
output=[2 4]

there will be 2 distinct number
 * 
 */



 import java.util.*;


 public class BitProblem15 {
     public static void main(String[] args) {
         
          Scanner sc = new Scanner(System.in);
        
          System.out.println("Enter The Size of The Array: ");
          int size = sc.nextInt();
          int [] arr=new int[size];
           System.out.println("Enter the elements");
          for(int i=0 ; i<size; i++){
              arr[i]=sc.nextInt();
          }
         
         // List<Integer> res=findSingleNumber(arr);
         // for(Integer num : res){
         //  System.out.println(num);   
         // }
         int res2[]=findSingleNumberOptimal(arr);
         
         for(int num : res2){
             System.out.println(num);
         }
         
         
         
     }
     
     public static List<Integer> findSingleNumber(int [] arr){
         HashMap<Integer,Integer> map = new HashMap<>();
         List<Integer> li= new ArrayList<>();
         for (int i = 0; i<arr.length; i++){
             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }
         
         for(int num : arr){
             if(map.get(num)==1){
                 li.add(num);
             }
         }
         return li;
     }
     
     
     public static int[] findSingleNumberOptimal(int [] arr){
         int bucket1=0;
         int bucket2=0;
         
         
         // Step 1: XOR all numbers to get the XOR of the two unique numbers
         int xor=0;
         for(int num : arr){
             xor=xor^num;
         }
         
         // Step 2: Find any set bit in the xor result (we can use the rightmost set bit)
         int setBit=xor &(-xor);
         
         // Step 3: Partition numbers into two buckets and find the unique numbers
         for(int num : arr){
             if((num & setBit) ==1){
                 bucket1^=num;
             }
             else{
                 bucket2^=num;
             }
         }
         
         return new int[]{bucket1,bucket2};
         
     }
     
         
 }

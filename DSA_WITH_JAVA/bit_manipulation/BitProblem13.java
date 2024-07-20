package bit_manipulation;

/*
 * Problem 14

Find the Single number 

eg: given array ----> arr=[1 ,2 ,1 ,3 , 2]
output = 3

Both the bruteforce apprach and optimized
 */



 import java.util.*;


 public class BitProblem13 {
     public static void main(String[] args) {
         
          Scanner sc = new Scanner(System.in);
        
          System.out.println("Enter The Size of The Array: ");
          int size = sc.nextInt();
          int [] arr=new int[size];
           System.out.println("Enter the elements");
          for(int i=0 ; i<size; i++){
              arr[i]=sc.nextInt();
          }
         
         int res=findSingle(arr);
         System.out.println(res);
     }
     
     public static int findSingle(int [] arr ){
         int l=arr.length;
         HashMap<Integer,Integer> map= new HashMap<>();
         for(int num : arr){
             map.put(num,map.getOrDefault(num,0)+1);
         }
         for(int num : arr){
             if(map.get(num)==1) return num;
            
         }
         return -1;
     }
 }

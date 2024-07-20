package bit_manipulation;

//power set (print all the subset)

/*
 * [1,2,3]
 * 
 * Subsets--> [],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]
 * total=8
 */





 import java.util.*;


 public class BitProblem12 {
     public static void main(String[] args) {
         
          Scanner sc = new Scanner(System.in);
        
          System.out.println("Enter The Size of The Set: ");
          int size = sc.nextInt();
          int [] arr=new int[size];
           System.out.println("Enter the elements");
          for(int i=0 ; i<size; i++){
              arr[i]=sc.nextInt();
          }
         
         
          List<List<Integer>> powerSet=getPowerSet(arr,size);
          System.out.println("The Power set is -----\n");
         for(List<Integer> subset: powerSet){
             System.out.print(subset+ " ");
         }
     }
     
     public static List<List<Integer>> getPowerSet(int [] arr , int size){
         List<List<Integer>> ps =new ArrayList<>();
         
         int totalSubsets=1<<size;
         for ( int num = 0 ; num<totalSubsets ;num++){
             List<Integer> li=new ArrayList<>();
             for(int j=0;j<size; j++){
                 if ((num & (1<<j))!=0) li.add(arr[j]);
             }
             ps.add(li);
         }
         
         return ps;
     }
     
     
 }

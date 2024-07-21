package bit_manipulation;



/*
 * Problem 14
Now single number 2

arr=[1 , 1,  2, 2, 1, 3, 2]

output= 1
 */


 /*
  * Approach:
Initialize an array of size 32 to count the number of 1s at each bit position (since integers are typically 32 bits in size).

For each number in the array, update the bit counts.

After processing all numbers, check the counts at each bit position. If the count is not a multiple of 3, it means the single number has a 1 at that position.

Combine the bit positions to form the single number.
  */



  import java.util.*;


  public class BitProblem14 {
      public static void main(String[] args) {
          
           Scanner sc = new Scanner(System.in);
         
           System.out.println("Enter The Size of The Array: ");
           int size = sc.nextInt();
           int [] arr=new int[size];
            System.out.println("Enter the elements");
           for(int i=0 ; i<size; i++){
               arr[i]=sc.nextInt();
           }
          
          int res=findSingleOptimal2(arr);
          System.out.println(res);
      }
      

      //using bitwise operator
          public static int findSingleOptimal(int [] arr ){
              int ans=0;
             
              for(int bitIndex=0;bitIndex<32;bitIndex++){
                  int count=0;
                  for(int i=0;i<arr.length;i++){
                      if((arr[i]&(1<<bitIndex))!=0)count++;
                  }
                  if(count%3==1){
                      ans= ans | (1<<bitIndex);
                  }
              }
              return ans;
          }



          //optimal
          public static int findSingleOptimal2(int [] arr){
              Arrays.sort(arr);
              for(int i = 1; i<arr.length; i+=3){
                 
                  if(arr[i]!=arr[i-1])return arr[i-1];
              }
              return arr[arr.length-1];
          }         
          
  }


/*
 * Problem 17

Important 

Methodology : Pick | Non-pick

return the count of subsequence where sum is k;

if arr=[1,2,1]  k=2
subsequence:  [ [2], [1,1]]
output : 2
 */



 import java.util.*;


 /*
 
 calSum(0, [1, 2, 1], 0, 2)
 |
 |-- calSum(1, [1, 2, 1], 1, 2)  // Include arr[0]
 |   |
 |   |-- calSum(2, [1, 2, 1], 3, 2)  // Include arr[1]
 |   |   |
 |   |   |-- calSum(3, [1, 2, 1], 4, 2)  // Include arr[2]
 |   |   |   - index == 3, sum != k, return 0
 |   |   |
 |   |   |-- calSum(3, [1, 2, 1], 3, 2)  // Exclude arr[2]
 |   |       - index == 3, sum != k, return 0
 |   |
 |   |-- calSum(2, [1, 2, 1], 1, 2)  // Exclude arr[1]
 |       |
 |       |-- calSum(3, [1, 2, 1], 2, 2)  // Include arr[2]
 |       |   - index == 3, sum == k, return 1
 |       |
 |       |-- calSum(3, [1, 2, 1], 1, 2)  // Exclude arr[2]
 |           - index == 3, sum != k, return 0
 |
 |-- calSum(1, [1, 2, 1], 0, 2)  // Exclude arr[0]
     |
     |-- calSum(2, [1, 2, 1], 2, 2)  // Include arr[1]
     |   |
     |   |-- calSum(3, [1, 2, 1], 3, 2)  // Include arr[2]
     |   |   - index == 3, sum != k, return 0
     |   |
     |   |-- calSum(3, [1, 2, 1], 2, 2)  // Exclude arr[2]
     |       - index == 3, sum == k, return 1
     |
     |-- calSum(2, [1, 2, 1], 0, 2)  // Exclude arr[1]
         |
         |-- calSum(3, [1, 2, 1], 1, 2)  // Include arr[2]
         |   - index == 3, sum != k, return 0
         |
         |-- calSum(3, [1, 2, 1], 0, 2)  // Exclude arr[2]
             - index == 3, sum != k, return 0
 
 
 */
 
 
 class ImpRecProblem5 {
     public static void main(String[] args) {
        System.out.println("Enter The Size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int [n];
        
        System.out.println("Enter all elements one by one : ");
        for (int i =0 ; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The target : ");
        int k =sc.nextInt();
        
        int res = countOfSeq(arr, n,k);
        System.out.println(res);
     }
     
     public static int countOfSeq(int [] arr , int n, int k){
         List<Integer> current = new ArrayList<>();
         int count=0;
         int sum = 0;
         
         int resCount=calSum(0,arr,sum , k);
         return resCount;
     }
     
     public static int calSum(int index, int [] arr , int sum  , int k){
         
        if(index==arr.length){
            if(sum==k)return 1;
            else return 0;
        }
     //   current.add(arr[index]);
        sum=sum+arr[index];
        int l=calSum(index+1,arr,sum,k);
        sum=sum-arr[index];
     //   current.remove(current.size()-1);
        
        int r= calSum(index+1,arr,sum,k);
        return l+r;
        
     }
     
 }

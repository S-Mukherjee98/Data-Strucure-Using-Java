import java.util.*;

/*
 * 
 * Problem 16

Important 

Methodology : Pick | Non-pick

return subsequence where sum is k;

if arr=[1,2,1]  k=2
output: [ [2], [1,1]]
 */


/*

calSum(0, [1, 2, 1], 0, [], [], 2)
|
|-- Include arr[0] (1)
|   |
|   |-- calSum(1, [1, 2, 1], 1, [1], [], 2)
|   |   |
|   |   |-- Include arr[1] (2)
|   |   |   |
|   |   |   |-- calSum(2, [1, 2, 1], 3, [1, 2], [], 2)
|   |   |   |   |
|   |   |   |   |-- calSum(3, [1, 2, 1], 3, [1, 2], [], 2)
|   |   |   |   |   - index == 3, sum != k, return
|   |   |   |
|   |   |   |-- Exclude arr[1]
|   |   |       |
|   |   |       |-- calSum(2, [1, 2, 1], 1, [1], [], 2)
|   |   |           |
|   |   |           |-- Include arr[2] (1)
|   |   |           |   |
|   |   |           |   |-- calSum(3, [1, 2, 1], 2, [1, 1], [], 2)
|   |   |           |   |   - index == 3, sum == k, add [1, 1] to result
|   |   |           |
|   |   |           |-- Exclude arr[2]
|   |   |               |
|   |   |               |-- calSum(3, [1, 2, 1], 1, [1], [], 2)
|   |   |                   - index == 3, sum != k, return
|   |   |
|   |   |-- Exclude arr[0]
|   |       |
|   |       |-- calSum(1, [1, 2, 1], 0, [], [], 2)
|   |           |
|   |           |-- Include arr[1] (2)
|   |           |   |
|   |           |   |-- calSum(2, [1, 2, 1], 2, [2], [], 2)
|   |           |   |   - index == 3, sum == k, add [2] to result
|   |           |
|   |           |-- Exclude arr[1]
|   |               |
|   |               |-- calSum(2, [1, 2, 1], 0, [], [], 2)
|   |                   |
|   |                   |-- Include arr[2] (1)
|   |                   |   |
|   |                   |   |-- calSum(3, [1, 2, 1], 1, [1], [], 2)
|   |                   |   |   - index == 3, sum != k, return
|   |                   |
|   |                   |-- Exclude arr[2]
|   |                       |
|   |                       |-- calSum(3, [1, 2, 1], 0, [], [], 2)
|   |                           - index == 3, sum != k, return
|


*/

class ImpRecProblem4 {
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
       
       List<List<Integer>> res = sumOfSeq(arr, n,k);
       System.out.println(res);
    }
    
    public static List<List<Integer>> sumOfSeq(int [] arr , int n, int k){
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        int sum = 0;
        
        calSum(0,arr,sum, current , res, k);
        return res;
    }
    
    public static void calSum(int index, int [] arr , int sum , List<Integer> current , List<List<Integer>> res, int k){
        
        if (index==arr.length){
            if(sum==k){
                res.add(new ArrayList<>(current));
            }
            return;
        }
        current.add(arr[index]);
        calSum(index+1,arr,sum+arr[index],current,res,k);
        current.remove(current.size()-1);
        calSum(index+1,arr,sum,current,res,k);
    }
    
}
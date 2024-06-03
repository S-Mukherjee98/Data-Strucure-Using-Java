package DSA_WITH_JAVA.Most_Common_Problems;


//Find the missing number in an array of integers.

// Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
//There are no duplicates in the list
/*
 Input: arr[] = {1, 2, 4, 6, 3, 7, 8} , N = 8
Output: 5
Explanation: Here the size of the array is 8, so the range will be [1, 8]. The missing number between 1 to 8 is 5
 */

public class Problem3 {

    public static int missingNumberFinder(int [] arr, int n){
        int N=n+1;
        int sumOriginal=N*(N+1)/2;
        int sumGiven=0;
        for (int i = 0; i < n; i++) {
            sumGiven+=arr[i];
        }
        int missingNum=sumOriginal-sumGiven;
        return missingNum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int N = arr.length;
        int res=missingNumberFinder(arr, N);
        System.out.println("The missing number is : "+res);
    }
    
}

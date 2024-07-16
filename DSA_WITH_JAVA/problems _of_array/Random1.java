package DSA_WITH_JAVA.problems _of_array;

import java.util.Scanner;

/*
Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

Note : Keep the first of the array unaltered. 

Example 1:

5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K
Output :

40 50 10 20 30

Example 2:

4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K
Output :

40 10 20 30
*/ 

import java.util.Scanner;

public class Random1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of The Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter All Elements One By One : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("K th value for the rotation : ");
        int k = sc.nextInt();

        int res[] = rotateArrayClockwise(arr, n, k);

        System.out.println("Result Array is ====");
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] rotateArrayClockwise(int[] arr, int n, int k) {
        if (k > n - 1) {
            k = k % (n - 1);
        }

        int[] ans = new int[n];
        ans[0] = arr[0]; // Keep the first element as it is

        // Copy the last k elements to the positions after the first element
        for (int i = 0; i < k; i++) {
            ans[i + 1] = arr[n - k + i];
        }

        // Copy the rest of the elements starting from the second position
        for (int i = 1; i < n - k; i++) {
            ans[i + k] = arr[i];
        }

        return ans;
    }
}


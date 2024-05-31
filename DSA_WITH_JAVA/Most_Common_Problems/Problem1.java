package DSA_WITH_JAVA.Most_Common_Problems;

//Rotate an Array

import java.util.Scanner;



public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Enter The Size Of The Array : ");
        int N;
        int[] arr;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            arr = new int[N];
            System.out.println("Enter All Elements One By One: ");
            for (int i = 0; i < N; i++) {
                arr[i]=sc.nextInt();
            }
            rotateArray(arr,N); 
            for (int i = 0; i < arr.length; i++) {
                System.out.print("  "+arr[i]);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
      

    }

    static void rotateArray(int arr[], int N){

        try {
            int start=0;
            int end=N-1;
            int temp;
            while (start<end) {
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        } catch (Exception e) {
         
        }
    }
}

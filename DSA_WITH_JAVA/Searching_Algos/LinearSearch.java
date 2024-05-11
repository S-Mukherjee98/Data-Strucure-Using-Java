package DSA_WITH_JAVA.Searching_Algos;

import java.util.Scanner;


public class LinearSearch {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Size of The Array : ");
       int size=sc.nextInt();

       int[] arr = inputArray(sc, size);
       System.out.println("Enter The target element to be searched : ");
       int target = sc.nextInt();
       int index=performSearch(arr,target);
       if (index==-1) {
        System.out.println("Element is not in the array");
       }
       else{
        System.out.println("Element exist on Index : "+index);
       }
    }

    public static int[] inputArray(Scanner sc,int size){
        System.out.println("Enter all elements of the array one by one : ");
        int [] arr= new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    
    public static int performSearch(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; 
    }
   
}

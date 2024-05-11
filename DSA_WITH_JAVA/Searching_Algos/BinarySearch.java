package DSA_WITH_JAVA.Searching_Algos;

import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args) throws Exception {
       

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Size of The Array: ");
            int size = sc.nextInt();
            sc.nextLine();
            int [] arr=inputArray(sc,size);

            //target
            System.out.println("Enter the target : ");
            int target = sc.nextInt();
            sc.close();
            int index=performSearch(arr,target);
            if (index==-1) {
                System.out.println("The element does not exist in the array");
            }
            else{

                System.out.println("The element exist on index : "+index);
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception caught: " + e.getMessage());
            throw e;
        }

    }

    public static int [] inputArray(Scanner sc, int size) throws Exception{
        try {
            int [] arr = new int[size];
            System.out.println("Enter all elements one by one : ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            return  arr;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception caught: " + e.getMessage());
            throw e;
            
        }
    }
    public static  int performSearch(int [] arr, int target){

        try {
            int low =0;
        int high=arr.length-1;

        while (low <=high) {
            int mid = low + (high-low) / 2;
            if (arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]<target){
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception caught: " + e.getMessage());
            throw e;
        }

        
    }
}

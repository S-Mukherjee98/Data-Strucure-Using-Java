package DSA_WITH_JAVA.Sorting_Algos;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Enter The Size Of The Array : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= inputArray(sc,n);
        sc.close();
        int [] sorted_arr = performSelectionSort(arr, n);

        System.out.println("------------------Sorted Array ------------------");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+sorted_arr[i]);
        }
    }

    public static int [] inputArray(Scanner sc, int n){
        int [] arr= new int[n];
        System.out.println("Enter all elements one by one : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int [] performSelectionSort(int [] arr , int n){

        int min ;
        int temp;

        for (int i = 0; i < n-2; i++) {
            min=i;
            for(int j = i+1; j <n; j++ ){
                if(arr[j] < arr[min]){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
}

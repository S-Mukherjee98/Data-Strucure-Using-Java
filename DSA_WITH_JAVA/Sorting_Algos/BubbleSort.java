package DSA_WITH_JAVA.Sorting_Algos;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter The Size of The Array : ");
        int n=sc.nextInt();
        int []arr=inputArray(sc,n);
        sc.close();
        int [] sorted_arr=performBubbleSort(arr, n);
        System.out.println("The sorted array : ");
       for (int i = 0; i < n; i++) {
           System.out.print("  "+arr[i]);
       }

    }

    public static int[] inputArray(Scanner sc , int n){
        System.out.println("Enter all elements of the array one by one : ");
        int [] arr= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static int [] performBubbleSort(int [] arr, int n){
        int i=0,j=0,temp;
        boolean swaped;
        for (i = 0; i <n-1 ; i++) {
            swaped=false;
            for (j = 0; j < n-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaped=true;
                }
            }
            if (swaped==false) {
                break;
            }
        }
        return arr;
    }
}

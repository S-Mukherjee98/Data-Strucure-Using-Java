
import java.util.*;


class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter All Element One By One : ");
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        //call the quick short function 1st
        
        quickSort(0,n-1,arr);
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
    public static void quickSort(int low , int high, int [] arr){
        if(low<high){
            int pi=partition(low , high, arr);
            quickSort(low, pi-1, arr);
            quickSort(pi+1,high, arr);
        }
    }
    
    public static int partition(int low, int high, int [] arr){
        int i=low;
        int j=high;
        int pivot = arr[low];
        while(i<j){
            
            while(i<=high && arr[i]<=pivot)i++;
            while(j>=low && arr[j]>pivot)j--;
            if (i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[low]=arr[j];
        arr[j]=pivot;
        return j;
    }
    
    
    
    
}

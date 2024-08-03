
//technique name : Divide and Merge






import java.util.*;


class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter All Element One By One : ");
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        mergeSort(arr,0,n-1);
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
    }
    
    public static void mergeSort(int [] arr, int low , int high){
        if(low>=high) return;
        int mid =  (high+low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    
    public static void merge(int [] arr , int low, int mid, int high){
        
        int n1= mid-low+1;
        int n2=high-mid;
        
        int [] arr1 = new int[n1];
        int [] arr2 = new int[n2];
        
        //copy the left half
        
        for(int i=0;i<n1;i++){
            arr1[i]=arr[low+i];
        }
        
        //copy the right half
        
        for(int j=0;j<n2;j++){
            arr2[j]=arr[mid+j+1];
        }
        
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
               arr[k]=arr1[i];
               i++;
            }
            else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        
        //remaining element
        while(i<n1){
            arr[k]=arr1[i];
            k++;
            i++;
        }
        
        while(j<n2){
            arr[k]=arr2[j];
            k++;
            j++;
        }
        
    }
}

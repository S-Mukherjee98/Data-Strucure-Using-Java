package recursion;

/*
 * Problem 12

Reverese an array using recursion
 */
import java.util.Scanner;
class RecProblem12{
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter all elements one by one ");
        for(int i=0; i<n ; i++)arr[i]=sc.nextInt();
        int start=0;
        int end=n-1;
        int[] res=reverseArray(arr,start,end);
        for(int i =0; i<n; i++)System.out.print(res[i]+" ");
        
    }
    
    public static int [] reverseArray(int [] arr,int start,int end){
        if(start>=end)return arr;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        return reverseArray(arr,start+1,end-1);
    }
    
    
}

package Important Array Question;


/*
Enter The Size Of the 1st Array : 
3
Enter All Elements One By One for 1st Array : 
1 7 9
Enter The Size Of the 2nd Array : 
4
Enter All Elements One By One for 2nd Array : 
2 4 6 8
Merged arr1: [1, 2, 4]
Merged arr2: [6, 7, 8, 9]

 */


import java.util.*;

public class MergeTwoArray {
    
    public static void main(String [] args){
        System.out.println("Enter The Size Of the 1st Array : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] arr1 = new int [n1];
        System.out.println("Enter All Elements One By One for 1st Array : ");
        for(int i = 0; i<n1; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter The Size Of the 2nd Array : ");
        int n2=sc.nextInt();
        int [] arr2 = new int[n2];
        System.out.println("Enter All Elements One By One for 2nd Array : ");
        for(int i = 0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }
        
        
        merge(arr1,arr2,n1,n2);
        
        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }
    
    public static void merge(int [] arr1, int [] arr2, int n1, int n2){
        
        for(int i=n1-1,j=0; i>=0 && j<n2 ; i--,j++){
            if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

}

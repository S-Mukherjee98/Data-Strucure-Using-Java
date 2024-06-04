package DSA_WITH_JAVA.Most_Common_Problems;

import java.util.Scanner;

public class Problem6 {
    public static int[] mergeSorted(int arr1[], int arr2[]){
        int N1,N2;
        N1=arr1.length;
        N2=arr2.length;
        int[] result=new int[N1+N2];

        int i=0,j=0,k=0;

        while (i<N1 && j<N2) {
            if (arr1[i]<arr2[j]) {
                result[k]=arr1[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }

        while (i<N1) {
            result[k]=arr1[i];
            i++;
            k++;
        }
        while (j<N2) {
            result[k]=arr2[j];
            j++;
            k++;
        }
        return  result;

    }

    public static void main(String[] args) {
        int N1,N2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The 1st Array : ");
        N1=sc.nextInt();
        System.out.println("Enter The Size Of The 2nd Array : ");
        N2=sc.nextInt();
        int [] arr1 =new int[N1];
        int [] arr2 =new int[N2];

        System.out.println("Enter All Element of 1st Array One By One : ");
        for (int i = 0; i < N1; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter All Element of 2nd Array One By One : ");
        for (int i = 0; i < N2; i++) {
            arr2[i]=sc.nextInt();
        }
        sc.close();
       int [] res= mergeSorted(arr1,arr2);
       for (int i = 0; i < (N1+N2); i++) {
           System.out.print("  "+res[i]);
       }
        
    }
}

package DSA_WITH_JAVA.Most_Common_Problems;

//Write a program to remove duplicates from a sorted array.

//!Naive Approache


public class Problem8 {


    public void removeDuplicates(int arr[], int n) {

        int [] temp=new int[n];
        int j=0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]!=arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++]=arr[n-1];
        for (int i = 0; i < j; i++) {
            arr[i]=temp[i];
        }

        for (int i = 0; i < j; i++) {
            System.out.print("  "+arr[i]);
        }
    }



    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = arr.length;
        Problem8 obj=new Problem8();
        obj.removeDuplicates(arr, n);
    }
}

package DSA_WITH_JAVA.Most_Common_Problems;

import java.util.HashSet;
import java.util.Set;





public class Problem8 {

    //!Naive Approache
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


    //!Using Set

    public int  removeDuplicates2(int arr[],int n){
        Set<Integer> unique_elements = new HashSet<>();
        int i ;


        if (n == 0 || n == 1)return n;
        for (i = 0; i < n; i++) {
            unique_elements.add(arr[i]);
        }
        int ind = 0;
        for (int elem : unique_elements) {
            arr[ind++] = elem;
        }
        return unique_elements.size();
    }

    public int  removeDuplicates3(int arr[],int n){

        int index = 0;

        if (n == 0 || n == 1)return n;

        for (int i = 0; i < n-1; i++) {
            if (arr[i]!=arr[i+1]) {
                arr[index++]=arr[i];
            }
        }
        arr[index++]=arr[n-1];
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = arr.length;
        Problem8 obj=new Problem8();
        // obj.removeDuplicates(arr, n);
        int res=obj.removeDuplicates3(arr, n);
        for (int i = 0; i < res; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}

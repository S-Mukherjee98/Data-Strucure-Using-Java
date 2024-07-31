/*
 * Problem Important
 
 Print all the subsequence of an array
 */




// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class ImpRecProblem1{
    public static void main(String[] args) {
        System.out.println("Enter The Size of The Array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter all elements one by one");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> current= new ArrayList<>();
        List<List<Integer>> res = subsequence(index,arr,current, li);
        for(List<Integer> el: res){
            System.out.print(el+" ");
        }
    }
    
    public static List<List<Integer>> subsequence(int index, int [] arr,List<Integer> current,List<List<Integer>> res){
        // List<List<Integer>> subseq = new ArrayList<>();
        if(index==arr.length){
            res.add(new ArrayList<>(current));
            return res;
        }
        
        //pick the current element
        current.add(arr[index]);
        subsequence(index+1,arr,current,res);
        
        //non pick the current element
        current.remove(current.size()-1);
        subsequence(index+1,arr,current,res);
        
        return res;
        
    }
    
    
}

import java.util.*;


class ImpRecProblem3{
    
    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Length Of The Array: ");
    int n = sc.nextInt();
    System.out.println("Enter All Elements One By One : ");
    int [] arr = new int[n];
    for(int i =0 ; i<n ; i++){
        arr[i]= sc.nextInt();
    }
    
    List<List<Integer>> res=subsetOfDup(arr,n);
    System.out.println(res);
}

public static List<List<Integer>> subsetOfDup(int [] arr, int n){
    Arrays.sort(arr);
    List<Integer> current= new ArrayList<>();
    List<List<Integer>> result= new ArrayList<>();
    int index=0;
    backtracking(index,current,result,arr);
    return result;
}

public static void backtracking(int index, List<Integer> current , List<List<Integer>> result, int [] arr){
    result.add(new ArrayList<>(current));
    for(int i = index; i<arr.length; i++){
        if(i!=index && arr[i]==arr[i-1])continue;
        current.add(arr[i]);
        backtracking(i+1,current,result,arr);
        current.remove(current.size()-1);
    }
}
    
}



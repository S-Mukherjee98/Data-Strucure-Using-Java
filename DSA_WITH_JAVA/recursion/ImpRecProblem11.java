//Print all the combination of an array

//More space complexity is here 


import java.util.*;

class ImpRecProblem11{
    
    
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of the array: ");
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter All Elements One By One : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        List<List<Integer>> res=generateCombination(arr);
        System.out.println(res);
    }
    
    public static List<List<Integer>> generateCombination(int [] arr){
        // Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int index =0;
        List<Integer> current= new ArrayList<>();
        int n=arr.length;
        boolean [] markTaken=new boolean[n];
        generate(index,current,arr,res,markTaken);
       return res;
    }
    
    public static void generate(int index,List<Integer> current, int [] arr, List<List<Integer>> res, boolean [] markTaken){
        if(current.size()==arr.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(markTaken[i])continue;
            current.add(arr[i]);
            markTaken[i]=true;
            generate(i+1,current,arr,res,markTaken);
            current.remove(current.size()-1);
            markTaken[i]=false;
            
        }
        
    }
    
    
}
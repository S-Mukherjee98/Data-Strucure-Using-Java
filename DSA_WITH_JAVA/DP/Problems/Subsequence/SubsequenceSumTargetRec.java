package DSA_WITH_JAVA.DP.Problems.Subsequence;

import java.util.*;
class SubsequenceSumTargetRec {
    public static void main(String[] args) {
        System.out.println("Enter The Size Of The Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter All Elements One By One : ");
        int [] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The Target : ");
        int target = sc.nextInt();
        
        System.out.println("Result :"+func(n-1,target,arr));
        
    }
    
    public static boolean func(int ind, int target, int [] arr){
        
        if(target == 0)return true;
        if(ind<0)return false;
        boolean nonTake=func(ind-1,target,arr);
        boolean take=false;
        if(arr[ind]<=target){
            take = func(ind-1, target-arr[ind],arr);
        }
        return nonTake || take;
        
    }
    
}

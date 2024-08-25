package DP.Problems.frog;

import java.util.Arrays;
import java.util.Scanner;


// ! Used Memoization method


class FrogJumpMemo {
    public static void main(String[] args) {
        System.out.println("Enter The Value n : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] cost =  new int[n];
        int [] mem = new int[n];
        Arrays.fill(mem,-1);
        
        System.out.println("Enter The Cost : ");
        for(int i = 0; i<n; i++){
            cost[i]=sc.nextInt();
        }
        int res = frogJump(n-1,cost,mem);
        System.out.println(res);
    }
    
    //calculate the min height or energy
    public static int frogJump(int n,int[] cost, int [] mem){
        if(n==0)return 0;
        
        if(mem[n]!=-1) return mem[n];
        
        int left = frogJump(n-1,cost,mem)+Math.abs(cost[n]-cost[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1){
          right = frogJump(n-2,cost, mem)+Math.abs(cost[n]-cost[n-2]);  
        }
        mem[n]= Math.min(left,right);
        return mem[n];
        
    }
}

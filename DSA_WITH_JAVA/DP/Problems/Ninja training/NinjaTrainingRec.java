package DP.Problems.Ninja training;




import java.util.*;
class NinjaTrainingRec {
    public static void main(String[] args) {
        System.out.println("Enter The Total Number of Days(rows): ");
        Scanner sc = new Scanner(System.in);
        int totalDays= sc.nextInt();
        System.out.println("Enter The Total Number of Task(cols): ");
        int totalTask=sc.nextInt();
        int [][] task= new int [totalDays][totalTask];
        for(int i=0;i<totalDays;i++){
            System.out.println("Enter task for the day "+i);
            for(int j=0;j<totalTask;j++){
                task[i][j]=sc.nextInt();
            }
        }
        // System.out.println(task);
        
        int res =func(task,totalDays-1,totalTask,totalTask);
        System.out.println(res);
    }
    
    public static int func(int [][] task, int day, int last, int totalTask){
        if(day<0)return 0;
        if(day==0){
            int maxi=0;
            for(int i =0; i<totalTask; i++ ){
                if(i!=last){
                    maxi=Math.max(maxi,task[0][i]);
                }
            }
            return maxi;
        }
        
        int maxi=0;
        int point=0;
        for(int i=0;i<totalTask;i++){
            if(i!=last){
                point=task[day][i]+func(task,day-1,i,totalTask);
            }
            maxi=Math.max(maxi,point);
        }
        return maxi;
    }
    
}

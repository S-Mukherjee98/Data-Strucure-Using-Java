package DP.Problems.Ninja training;




import java.util.*;

class NinjaTrainingMem {
    public static void main(String[] args) {
        System.out.println("Enter The Total Number of Days(rows): ");
        Scanner sc = new Scanner(System.in);
        int totalDays = sc.nextInt();
        System.out.println("Enter The Total Number of Task(cols): ");
        int totalTask = sc.nextInt();
        
        int[][] dp = new int[totalDays][totalTask + 1];
        for (int i = 0; i < totalDays; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        int[][] task = new int[totalDays][totalTask];
        for (int i = 0; i < totalDays; i++) {
            System.out.println("Enter task values for day " + i + ":");
            for (int j = 0; j < totalTask; j++) {
                task[i][j] = sc.nextInt();
            }
        }
        
        // Set `last = totalTask` to indicate no restriction on the last day's task choice
        int res = func(task, totalDays - 1, totalTask, totalTask, dp);
        System.out.println("Maximum points: " + res);
    }

    public static int func(int[][] task, int day, int last, int totalTask, int[][] dp) {
        if (day < 0) return 0;
        
        if (day == 0) {
            int maxPoints = 0;
            for (int i = 0; i < totalTask; i++) {
                if (i != last) {
                    maxPoints = Math.max(maxPoints, task[0][i]);
                }
            }
            return maxPoints;
        }
        
        if (dp[day][last] != -1) return dp[day][last];
        
        int maxPoints = 0;
        for (int i = 0; i < totalTask; i++) {
            if (i != last) {
                int points = task[day][i] + func(task, day - 1, i, totalTask, dp);
                maxPoints = Math.max(maxPoints, points);
            }
        }
        
        dp[day][last] = maxPoints;
        return maxPoints;
    }
}

package DSA_WITH_JAVA.Most_Common_Problems;

// import java.util.Scanner;

// class Marathon {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int minTime = Integer.MAX_VALUE;
//         int minBibNumber = -1;
        
//         for (int i = 0; i < N; i++) {
//             int bibNumber = sc.nextInt();
//             int time = sc.nextInt();
            
         
//             if (time < minTime) {
//                 minTime = time;
//                 minBibNumber = bibNumber;
//             }
//         }
//         System.out.println(minBibNumber);
        
//         sc.close();
//     }
// }


import java.util.Scanner;

class Marathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int N = scanner.nextInt();
        
        
        int fastestBibNumber = -1;
        int fastestTime = Integer.MAX_VALUE;
        
        
       for (int i = 0; i < N; i++) {
            int bibNumber = scanner.nextInt();
            int time = scanner.nextInt();
            
            if (time < fastestTime) {
                fastestTime = time;
                fastestBibNumber = bibNumber;
            }
        }
        
        
        System.out.println(fastestBibNumber);
        
        
    }      
}



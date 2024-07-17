import java.util.Scanner;

/*
 * clear the ith bit. means if the ith bit is 1 make it 0 . if it is 0 then it will be as it is
 */



public class BitProblem4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = sc.nextInt();
        System.out.println("Enter The ith value : ");
        int i = sc.nextInt();

        int res=clearBit(num,i);
        System.out.println(res);
    }

    public static int clearBit(int num,int i) {
        return (num & ~(1<<i));
    }
}

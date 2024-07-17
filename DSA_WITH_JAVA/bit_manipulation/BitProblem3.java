
/*

set the i th value of a number 


eg: number 10 --binary--> 1010
value of i =2

the binary should be 1110 */

import java.util.Scanner;

public class BitProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = sc.nextInt();
        System.out.println("Enter The ith value : ");
        int i = sc.nextInt();

        int res=setvalue(num,i);
        System.out.println(res);
    }

    public static int setvalue(int num, int i) {
        return (num | (1<<i));
    }
}

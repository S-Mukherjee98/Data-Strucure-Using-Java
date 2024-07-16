import java.util.Scanner;

class XORSwapping{

    public static void main(String[] args) {
        System.out.println("Enter value of a = ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter value of b = ");
        int b=sc.nextInt();

        swapNormal(a,b);
        swapXor(a,b);
    }

    public static void swapNormal(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Normal :: Value of a = "+a+"\n Value of b = "+b);
    }

    public static void swapXor(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("Using XOR :: Value of a = "+a+"\n Value of b = "+b);

    }

}
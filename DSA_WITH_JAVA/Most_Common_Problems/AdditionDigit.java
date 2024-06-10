package DSA_WITH_JAVA.Most_Common_Problems;

import java.util.Scanner;

public class AdditionDigit {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter The Number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        // Check if the number is a valid two-digit number
        if (number < 10 || number > 99) {
            System.out.println("Invalid Input");
        } else {
            int sum = 0;

            // Loop to extract each digit and add to sum
            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            System.out.println("Alice must go in path-" + sum);
        }
    }
}

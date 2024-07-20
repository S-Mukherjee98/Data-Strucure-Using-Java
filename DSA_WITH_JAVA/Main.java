import java.util.Scanner;

class PaymentValidationException extends Exception {
    public PaymentValidationException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class PaymentService {
    public void validatePaymentDetails(String paymentDetails) throws PaymentValidationException {
        if (paymentDetails == null || paymentDetails.trim().isEmpty()) {
            throw new PaymentValidationException("Payment details are invalid.");
        }
    }

    public void checkAccountBalance(double balance, double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
    }

    public void processPayment(String paymentDetails, double balance, double amount) {
        try {
            validatePaymentDetails(paymentDetails);
            checkAccountBalance(balance, amount);
            System.out.println("Payment processed successfully.");
        } catch (PaymentValidationException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter payment details:");
        String paymentDetails = scanner.nextLine();

        System.out.println("Enter account balance:");
        double balance = scanner.nextDouble();

        System.out.println("Enter payment amount:");
        double amount = scanner.nextDouble();

        paymentService.processPayment(paymentDetails, balance, amount);
}
}

import java.util.Scanner;

public class CustomExceptions {
    // to notify that this exception might occur
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You can vote");
        } else {
            // throw new ArithmeticException("You cannot vote.");
            // raise CustomException
            throw new InvalidAgeException("You cannot vote.");
        }
    }
}

/*
 * Exception class is and must be the parent
 * of all exception classes
 */

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

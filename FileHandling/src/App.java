import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import ATM.Account;

public class App {
    public static void main(String[] args) throws Exception {

        handleFile();

        Account account = new Account("John");
        Scanner scanner = new Scanner(System.in);

        int amount, choice;
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1.Check Balance\n2.Withdraw\n3.Deposit\n4.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextInt();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextInt();
                    account.deposit(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using our service");
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        scanner.close();

    }

    public static void handleFile() throws Exception {
        File file = new File("log.csv");

        if (!file.exists()) {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("username,action,amount,balance\n");
            fileWriter.close();
        }
    }

}

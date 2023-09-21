package ATM;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Account {
    /*
     * String username
     * int balance
     */

    String username;
    int balance;

    static File file = new File("log.csv");

    public Account(String username) throws Exception {
        this.username = username;
        setBalance();
    }

    public void setBalance() throws FileNotFoundException {

        if (file.exists()) {
            // there's some prev transaction
            Scanner scanner = new Scanner(file);
            String lastLine = "";
            int count = 0;
            while (scanner.hasNextLine()) {
                lastLine = scanner.nextLine();
                count++;
            }
            if (count == 1 || count == 0) {
                this.balance = 1000;
            }
            else {
                String[] arr = lastLine.split(",");
                this.balance = Integer.parseInt(arr[arr.length-1]); // last element -> balance
            }
            scanner.close();
        }
        else {
            this.balance = 1000;
        }
    }

    public String getUsername() {
        return this.username;
    }

    public int getBalance() {
        return this.balance;
    }

    public void withdraw(int amt) throws IOException {
        if (this.balance < amt) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amt;
            log("withdraw", amt);
        }
    }

    public void deposit(int amt) throws IOException {
        this.balance += amt;
        log("deposit", amt);
    }

    void log(String action, int amt) throws IOException {
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(this.username + "," + action + "," + amt + "," + this.balance + "\n");
        fileWriter.close();
    }

}

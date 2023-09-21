// import Scanner class
import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        /*
        Instance/object is like a replica of a class, but the objects
        have the values of their own.
        */
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next(); // ABC DEF; s1 = ABC
        String s2 = scanner.nextLine(); // ABC DEF; s2 = ABC DEF

        int n1 = scanner.nextInt(); // 1 2 3; n1 = 1
        int n2 = scanner.nextInt(); // n2 = 2
        int n3 = scanner.nextInt(); // n3 = 3

        boolean b1 = scanner.nextBoolean();

        double d1 = scanner.nextDouble();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(b1);
        System.out.println(d1);

    }
}

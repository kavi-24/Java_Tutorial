public class Operators {
    public static void main(String[] args) {

        /*
         * Arithmetic
         * Unary
         * Assignment
         * Comparison
         * Logical
         * Bitwise
         */

        /*
         * Arithmetic -> +, -, *, /, %
         */

        int a = 10;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // int / int -> int
        System.out.println(a % b); // remainder or modulo op

        double c = 6.0;
        System.out.println(a / c); // int / double or double / int -> double
        System.out.println(c / b);

        /*
         * Unary -> Requires only one operand -> ++, --, ~
         * Pre increment -> ++x
         * Post increment -> x++
         * Pre decrement -> --x
         * Post decrement -> x--
         * ~x -> -(x+1)
         * 
         * Pre -> Operation occurs, then statement is executed
         * Post -> Statement occurs, then operation is executed
         */

        int x = 10;
        System.out.println(++x); // 11
        System.out.println(x++);
        // 12
        System.out.println(--x); // 11
        System.out.println(x--);
        // 10

        System.out.println(~x); // - (10+1) = -11
        System.out.println(x);

        /*
         * Assignment -> +=, -=, *=, /=, %=
         */

        a += b; // a = a + b
        System.out.println(a);
        a -= b; // a = a - b;
        System.out.println(a);
        a *= b; // a = a * b;
        System.out.println(a);
        a /= b; // a = a / b;
        System.out.println(a);
        a %= b; // a = a % b;
        System.out.println(a);

        /*
         * Comparison -> >, <, ==, !=, <=, >= -> returns boolean value (true or false)
         */
        a = 10;
        b = 4;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a > b);

        /*
         * Logical -> && (and), || (or), !(not)
         */

        /*
         * AND Table
         * true && true == true
         * true && false == false && true == false
         * false && false == false
         */

        /*
         * OR Table
         * true || true == true
         * true || false == false || true == true
         * false || false == false
         */

        /*
         * NOT table
         * !true = false
         * !false = true
         */

        System.out.println(true || (false && (true && !false)));

        /*
         * bitwise (& - and, | - or, ^ - xor, ~ - not, >> - left shift, << - right
         * shift)
         * true - 1 ; false - 0
         * 5 = 101
         * 3 = 011
         * and = 001 (1)
         * or = 111 (7)
         * xor = 110 (6)
         * not(5) = -(5+1) = -6
         * left shift: 5 >> 2 = 001 (1)
         * right shift: 5 << 2 = 10100 (20)
         */

        a = 5;
        b = 3;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a >> 2);
        System.out.println(a << 2);

    }
}

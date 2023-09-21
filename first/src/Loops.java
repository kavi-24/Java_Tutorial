public class Loops {
    public static void main(String[] args) {
        /*
         * while (condition is false) {
         * do smtg
         * 
         * end condition statement
         * }
         */
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        i = 0;

        /*
         * while condition is checked
         * after do block is run
         */

        do {
            System.out.println(i);
            i++;
        } while (i < 11);

        /*
         * for (init; end condition; do smtg on each loop)
         */

        for (int j = 0; j < 11; j++) {
            System.out.println(j);
        }

        /*
         * FizzBuzz game
         * If multiple of 3 -> Fizz
         * If multiple of 5 -> Buzz
         * If multiple of 3 and 5 -> FizzBuzz
         */

        for (i = 1; i < 101; i++) {
            /*
             * % -> remainder
             * so if i % 3 == 0, i -> multiple of 3
             */
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        /*
         * break -> terminate the loop
         * continue -> skip current iteration
         */

        /*
         * skip multiples of 3
         * stop loop if multiple of 15 occurs
         */

        // infinite loop (if no end condition/break is used)
        i = 0;
        while (true) {

            i++;

            if (i % 15 == 0) {
                break;
            }

            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);

        }

    }
}

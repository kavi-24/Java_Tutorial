public class Conditionals {
    public static void main(String[] args) {
        /*
        if
        else if
        else

        If one of the if-else if-else statement is true,
        other block's statements won't run.
        */

        boolean canIVote = true;
        boolean canIDrive = false;

        if (canIVote && canIDrive) {
            System.out.println("I can vote and drive");
        }
        else if (canIVote) {
            System.out.println("I can only vote");
        }
        else if (canIDrive) {
            System.out.println("I can only drive");
        }
        else {
            System.out.println("I can neither vote nor drive");
        }

        // nested if-else
        if (canIVote && canIDrive) {
            if (true) {
                if (false) {

                }
            }
            else {

            }
        }
        else {
            if (false) {

            }
            else {

            }
        }

        // ternary operator
        // (condition) ? true : false

        System.out.println(canIDrive ? "I can drive" : "I cannot drive");

    }
}

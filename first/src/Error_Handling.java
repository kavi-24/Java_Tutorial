public class Error_Handling {
    /*
     * Catch the error before an Exception is raised to stop the flow of program
     */
    public static void main(String[] args) {
        try {
            int n = 24 / 2; // ArithmeticException -> cannot divide by 0
            System.out.println(n);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            /*
             * finally block runs in any case
             * i.e., after try or catch, it will run
             */
            System.out.println("finally... end of program");
        }
    }
}

public class Functions {
    /*
    public - can be accessed anywhere in the project
    protected - can be accessed anywhere in the class
    private - cannot be accessed
    */
    public static void main(String[] args) {
        printer();
        int result = adder(10, 5);
        System.out.println(result);
        double dResult = adder(5.4, 4.9);
        System.out.println(dResult);
    }

    /*
    access_modifier [static] return_type func_name(arguments) {
        // do smtg
    }
    */

    /*
    static -> same in all instance of the class
    printer() is going to remain same in all the objects that
    is an instance of Functions.
    */

    // void -> nothjng, null
    static void printer() {
        System.out.println("Hi");
        System.out.println("Hello");
        System.out.println("How are you ?");
    }

    // return smtg
    static int adder(int n1, int n2) {
        return n1 + n2;
    }

    // add double ?? but with same function name
    // method overloading 
    // Multiple methods can have the same name as long as the number and/or type of parameters are different.
    static double adder(double n1, double n2) {
        return n1 + n2;
    }

}

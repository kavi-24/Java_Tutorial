public class Type_Casting {
    /*
    The process of converting one datatype into another
    */

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
        double d = n; // since double has more bits than int, so double can store an int
        System.out.println(d);
        double d2 = 24.12032004;
        System.out.println(d2);
        int n2 = (int) d2;  // reduces the accuracy/precision of double and stores in int
        System.out.println(n2);
        float f = (float) d2;
        System.out.println(f);
        long l = (long) d2;
        System.out.println(l);

        // specific to classes
        String s = "5.24";
        Double d3 = Double.parseDouble(s);
        System.out.println(d3);
        s = "5";
        int n3 = Integer.parseInt(s);
        System.out.println(n3);
        s = "7A41"; 
        // <- hex repr
        n3 = Integer.parseInt(s, 16);  // radix -> base
        System.out.println(n3);
        
        /*
        numbers in a sequence < base number.

        decimals -> base 10
        binary -> base 2
        octal -> base 8
        hexadecimal -> 16
        */

    }

}

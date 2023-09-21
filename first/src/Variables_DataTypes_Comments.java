public class Variables_DataTypes_Comments {
    public static void main(String[] args) {
        // datatype variablename = value;
        int num = 3;
        String name = "My name";
        char grade = 'A';
        double cgpa = 9.24;
        /*
        float -> 7 bit integer (2^0 to 2^7) 
        double -> double the precision -> 15 bit integer (2^0 to 2^15)
        long -> 64 bit integer (2^0 to 2^63)
        */
        boolean canVote = true;
        float f = 3.14f;
        long l = 1234567890;

        System.out.println(num);
        System.out.println(name);
        System.out.println(grade);
        System.out.println(cgpa);
        System.out.println(canVote);
        System.out.println(f);
        System.out.println(l);
        
    }
}

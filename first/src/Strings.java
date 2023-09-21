public class Strings {
    public static void main(String[] args) {
        /*
        String -> sequence of characters/letters
        */
        String s1 = "Hi, hello, how are you ?";
        System.out.println(s1.length());
        // indexing starts at 0
        System.out.println(s1.charAt(13));
        System.out.println(s1.substring(11, 22));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.contains("you"));
        System.out.println(s1.toCharArray()); // ['H', 'i', ',', ' ', 'h', ...]
    }
}

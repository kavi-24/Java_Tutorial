public class Arrays {
    // arrays -> list/sequence
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4};
        int[] n2 = new int[6]; // default: filled with 0
        arrayPrinter(n1);
        arrayPrinter(n2);

        String s1 = "My name";
        String[] splitBySpace = s1.split(" ");
        arrayPrinter(splitBySpace);

        char[] charArr = s1.toCharArray();
        System.out.println(charArr);
        arrayPrinter(charArr);

        int[] n1Clone = n1.clone();

    }

    static void arrayPrinter(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // access the element via index
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void arrayPrinter(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
        System.out.println();
    }

    static void arrayPrinter(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

}

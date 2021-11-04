package ds.arrays.recursion;

public class ReverseStringRecursionEx {
    public static void main(String... args) {
        String originalString = "abcde"; // String to be reversed

        System.out.println("Original String: " + originalString);
        System.out.print("Reversed String: ");
        reverseRecursively(originalString);
    }

    /*
     * reverse string recursively.
     */
    public static void reverseRecursively(String str) {

        if (str.length() == 1) {
            System.out.print(str);
        } else {
            reverseRecursively(str.substring(1, str.length()));
            System.out.print(str.substring(0, 1));
        }
    }
}
/*
 * OUTPUT
 *
 * Original String: abcde
 * Reversed String: edcba
 *
 */
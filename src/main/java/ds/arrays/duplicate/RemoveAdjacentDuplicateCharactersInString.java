package ds.arrays.duplicate;

public class RemoveAdjacentDuplicateCharactersInString {

    // Function to remove adjacent duplicates characters from a string
    public static String removeDuplicates(String str) {
        // base case
        if (str == null) {
            return null;
        }

        char[] chars = str.toCharArray();
        char previous = 0;
        int k = 0;

        for (char current : chars) {
            if (previous != current) {
                chars[k++] = current;
                previous = current;
            }
        }

        return new String(chars).substring(0, k);
    }

    public static void main(String[] args) {
        String s = "AAABBCDDD";
        System.out.println("Input  => " + s);
        System.out.println("Output => " + removeDuplicates(s));
    }
}
/*

Input  => AAABBCDDD
Output => ABCD

 */
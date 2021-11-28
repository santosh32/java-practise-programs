package ds.arrays.duplicate;

import java.util.ArrayList;

public class FindDuplicatesInStringArray {

    public static void main(String[] args) {
        String inputString = "My name is Guarav Kukade!";

        printDuplicates(inputString);
    }

    public static void printDuplicates(String inputString) {

        ArrayList<Character> chars = new ArrayList<>();

        char[] c = inputString.toCharArray();

        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    if (chars.contains(c[i])) {
                        break;
                    } else {
                        if (!" ".equals(String.valueOf(c[i])))
                            chars.add(c[i]);
                    }
                }
            }
        }
        if (chars.size() > 0) {
            System.out.print("Duplicates: " + chars);
        } else {
            System.out.print(
                    "No duplicates present in arrays");
        }
        System.out.println();
        System.out.println("---------------------------");
    }
}
/*
Char: a, Count: 4 times.
Char: e, Count: 2 times.
Char: u, Count: 2 times.
 */
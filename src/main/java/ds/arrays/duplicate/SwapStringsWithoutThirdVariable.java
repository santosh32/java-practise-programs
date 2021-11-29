package ds.arrays.duplicate;

/*
 * A java program to swap strings without using the third variable.
 */
public class SwapStringsWithoutThirdVariable {

    public static void main(String[] args) {

/*        String firstString = "one";
        String secondString = "two";

        System.out.println("Before swapping....");
        System.out.println("The first String  = " + firstString);
        System.out.println("The second String = " + secondString);

        firstString = firstString + secondString; // step 1
        secondString = firstString.substring(0, (firstString.length() - secondString.length())); // step 2
        firstString = firstString.substring(secondString.length()); // step 3

        System.out.println("\nAfter swapping....");
        System.out.println("The first String  = " + firstString);
        System.out.println("The second String = " + secondString);*/

        StringBuilder builder = new StringBuilder();

        int a[] = new int[]{1, 2, 3, 3, 4, 5, 6, 8, 7};
        for (int i = 0; i < a.length - 1; i++) {
            builder.append(a[i]);
            if (a[i] % 2 == 0 && a[i + 1] % 2 == 0) {
                builder.append(a[i + 1] + "_");
            } else if (a[i] % 2 != 0 && a[i + 1] % 2 != 0) {
                builder.append(a[i + 1] + "*");
            }
        }
        System.out.println(builder);

    }

}
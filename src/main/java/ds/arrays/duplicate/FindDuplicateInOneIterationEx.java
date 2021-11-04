package ds.arrays.duplicate;

import java.util.Arrays;

public class FindDuplicateInOneIterationEx {

    static int ar[] = {3, 7, 3, 5, 8, 9, 24, 8, 9}; // given array

    public static void main(String[] args) {
        System.out.print("array : ");
        for (int j = 0; j < ar.length; j++)
            System.out.print(ar[j] + " "); // display it
        System.out.println();
        System.out.println("Max: " + Arrays.stream(ar).max().getAsInt());
        displayDuplicateInOneIteration();
    }

    /*
     * Method for displaying duplicate in one iteration
     */
    public static void displayDuplicateInOneIteration() {

        int tempAr[] = new int[100];

        System.out.print("\nduplicates :  ");
        for (int j = 0; j < ar.length; j++) {
            if (tempAr[ar[j]] == 0) {
                tempAr[ar[j]] = 1;
            } else {
                System.out.print(ar[j] + " ");
            }
        }
    }

}

/*
 * OUTPUT
 *
 * array : 3 7 3 5 8 9 24 8 9
 * duplicates : 3 8 9
 *
 */

package ds.arrays;

public class TwoConsecutiveNumbersWithHighestSum {

    public static void main(String[] args) {
        int ar[] = {1, 9, 8, 3, 6, 9, 9, 5, 4, 9};
        // int ar[] = { 1, 5, 8, 3, 6, 8, 7, 5, 4, 9 }; //Test array
        // int ar[] = { 1, 2, 8, 3, 6, 1, 7, 5, 4, 7 }; //Test array
        findSetOfNumber(ar);
    }

    static void findSetOfNumber(int ar[]) {
        int sum = 0;
        int maxSum = 0;
        int temp1 = 0, temp2 = 0;
        for (int i = 1; i < ar.length; i++) {
            sum = ar[i - 1] + ar[i];
            if (sum > maxSum) {
                maxSum = sum;
                temp1 = i - 1;
                temp2 = i;
            }
        }

        System.out.println("numbers= " + ar[temp1] + "," + ar[temp2] + " & index=" + temp1 + ", " + temp2);
    }

}

/*
 * OUTPUT
 *
 * numbers= 9,9 & index=5, 6
 *
 */

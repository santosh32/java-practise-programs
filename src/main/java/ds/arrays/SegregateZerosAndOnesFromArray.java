package ds.arrays;

import java.util.Arrays;

public class SegregateZerosAndOnesFromArray {

    static void segregateZerosAndOnes(int a[]) {

        System.out.println("Array Before segregate : " + Arrays.toString(a));

        int i = 0, j = a.length - 1;

        while (i < j) {
            while (a[i] == 0 && i < j)
                i++;
            while (a[j] == 1 && i < j)
                j--;
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println("Array After segregate : " + Arrays.toString(a));

        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        segregateZerosAndOnes(new int[]{1, 0, 0, 1, 1});

        segregateZerosAndOnes(new int[]{1, 1, 0, 0, 0, 1});

    }
}
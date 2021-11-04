package ds.arrays;

import java.util.Arrays;

public class SegregateOddEvenNumberSorting {

    static void sorting(int a[]) {

        System.out.println("Array Before sorting : " + Arrays.toString(a));
        System.out.println("=========================================");

        int i = 0, j = a.length - 1;

        while (i < j) {
            while (i < j && a[i] % 2 == 0)
                i++;
            while (i < j && a[j] % 2 != 0)
                j--;
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            System.out.println(Arrays.toString(a));
        }

        System.out.println("Array After sorting : " + Arrays.toString(a));

        // TODO: two sub sets sorting goes

        System.out.println("i=" + i + " , j=" + j);

        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        sorting(new int[]{1, 3, 3, 5, 1});

        sorting(new int[]{12, 9, 21, 17, 33, 7});

    }
}

/*
Array Before sorting : [4, 5, 8, 9, 10]
=========================================
[4, 10, 8, 9, 5]
[4, 10, 8, 9, 5]
Array After sorting : [4, 10, 8, 9, 5]
i=3 , j=2
=========================================
Array Before sorting : [12, 9, 21, 17, 33, 7]
=========================================
[12, 9, 21, 17, 33, 7]
Array After sorting : [12, 9, 21, 17, 33, 7]
i=1 , j=0
=========================================
 */
package ds.arrays.duplicate;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicatesFromArray {

    static void unique_array(int[] a) {

        System.out.println("Original Array : " + Arrays.toString(a));

        int n = a.length;

        ArrayList<Integer> al = new ArrayList<>();

        // 10, 22, 10, 20, 11, 22
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    if (al.contains(a[i])) {
                        break;
                    } else {
                        al.add(a[i]);
                    }
                }
            }
        }

        if (al.size() > 0) {
            System.out.print("Duplicates: " + al);
        } else {
            System.out.print(
                    "No duplicates present in arrays");
        }
        System.out.println();
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        unique_array(new int[]{1, 3, 7, 8, 8, 9, 8, 9, 14, 16, 16, 17, 17});

        unique_array(new int[]{10, 22, 10, 20, 11, 22});
    }
}
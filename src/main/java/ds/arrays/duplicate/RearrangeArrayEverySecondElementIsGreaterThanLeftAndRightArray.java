package ds.arrays.duplicate;

import java.util.Arrays;

class RearrangeArrayEverySecondElementIsGreaterThanLeftAndRightArray {
    // Utility function to swap elements `arr[i]` and `arr[j]` in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to rearrange the array such that every second element
    // of the array is greater than its left and right elements
    public static void rearrangeArray(int[] arr) {
        // start from the second element and increment index
        // by 2 for each iteration of the loop
        for (int i = 1; i < arr.length; i += 2) {
            // if the previous element is greater than the current element,
            // swap the elements
            if (arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
            }

            // if the next element is greater than the current element,
            // swap the elements
            if (i + 1 < arr.length && arr[i + 1] > arr[i]) {
                swap(arr, i + 1, i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 8, 3, 7};

        rearrangeArray(arr);

        // print output array
        System.out.println(Arrays.toString(arr));
    }
}

/*
input : {9, 6, 8, 3, 7}
output: [6, 9, 3, 8, 7]

 */


package ds.arrays.basic;

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber {

    static void findSubArray(int[] inputArray, int inputNumber) {

        //Initializing 'sum' to 0
        int sum = 0;

        //Iterating through 'inputArray'
        for (int i = 0; i < inputArray.length; i++) {

            //Assigning inputArray[i] to 'sum'
            sum = inputArray[i];

            for (int j = i + 1; j < inputArray.length; j++) {

                //Adding inputArray[j] to 'sum'
                sum = sum + inputArray[j];

                //If 'sum' is equal to 'inputNumber' then printing the sub array
                if (sum == inputNumber) {
                    System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is " + inputNumber + " is ");

                    for (int k = i; k <= j; k++) {
                        System.out.print(inputArray[k] + " ");
                    }

                    System.out.println();
                }

                //if 'sum' is smaller than 'inputNumber', continue the loop
                else if (sum < inputNumber) {
                    continue;
                }

                //if 'sum' is greater than 'inputNumber', then break the loop
                else if (sum > inputNumber) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }
}
/*
Continuous sub array of [42, 15, 12, 8, 6, 32] whose sum is 26 is
12 8 6
Continuous sub array of [12, 5, 31, 13, 21, 8] whose sum is 49 is
5 31 13
Continuous sub array of [15, 51, 7, 81, 5, 11, 25] whose sum is 41 is
5 11 25

 */
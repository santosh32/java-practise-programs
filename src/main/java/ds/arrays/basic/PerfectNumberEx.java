package ds.arrays.basic;

public class PerfectNumberEx {

    public static void main(String a[]) {
        int n = 28;
        System.out.println(
                isPerfectNumber(n) == true ? n + " is perfect number."
                        : n + " is not a perfect number.");
    }

    public static boolean isPerfectNumber(int number) {

        int sumOfDivisors = 1; // 1 is divisor of all the numbers, so initially
        // keep the sumOfDivisors=1 and start check
        // divisors from 2.
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0)
                sumOfDivisors += i;

        if (sumOfDivisors == number)
            return true;
        else
            return false;

    }

}
/*
 * OUTPUT
 *
 * 28 is perfect number.
 *
 */
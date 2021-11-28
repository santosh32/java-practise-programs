package core.java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class FindSumOfNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 4, 10, 12, 87, 33, 75);

        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println("Sum of all numbers : " + stats.getSum());
    }
}

package core.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindHighestAndLowestNumberInList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        Optional<Integer> min = numbers.stream().min(Comparator.comparingInt(a -> a));
        Optional<Integer> max = numbers.stream().max(Comparator.comparingInt(a -> a));

        System.out.println("Lowest number in List : " + min.get());
        System.out.println("Highest number in List : " + max.get());
    }
}
/*
Lowest number in List : 2
Highest number in List : 7
 */

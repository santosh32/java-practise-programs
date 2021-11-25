package core.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInNaturalOrder {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        List<Integer> sorted = numbers.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println("Before : " + numbers);
        System.out.println("After : " + sorted);

    }
}
/*
Before : [3, 2, 2, 3, 7, 3, 5]
After : [2, 2, 3, 3, 3, 5, 7]
 */
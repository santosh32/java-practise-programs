package core.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
        List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());

        System.out.println("Before : " + intList);
        System.out.println("After : " + distinctIntList);

    }
}
/*
Before : [2, 5, 3, 2, 4, 3]
After :  [2, 5, 3, 4]
 */
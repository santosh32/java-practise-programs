package core.java8;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Person> predicate = (person) -> person.getAge() > 28;
        boolean result = predicate.test(new Person("ramesh", 25));
        System.out.println(result);
    }
}
package core.java8.streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


class SortKeyInMapEx {

    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<>();

    // Function to sort map by Key
    public static void sortByKey() {
        HashMap<String, Integer> temp
                = map.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getKey().compareTo(
                        i2.getKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        // Display the HashMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    // Driver Code
    public static void main(String args[]) {
        // putting values in the Map
        map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("-----------------");
        // Calling the function to sortbyKey
        sortByKey();
    }
}
/*

Key = Jayant, Value = 80
Key = Anushka, Value = 80
Key = Amit, Value = 75
Key = Abhishek, Value = 90
Key = Danish, Value = 40
-----------------
Key = Abhishek, Value = 90
Key = Amit, Value = 75
Key = Anushka, Value = 80
Key = Danish, Value = 40
Key = Jayant, Value = 80

 */
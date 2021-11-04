package ds.arrays.duplicate;

import java.util.ArrayList;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();

        arrayList.add("java");
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('a');
        arrayList.add("java");
        arrayList.add(10.3);
        arrayList.add('c');
        arrayList.add(14);
        arrayList.add("java");
        arrayList.add(12);

        System.out.println("Before Remove Duplicate elements:" + arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After Removing duplicate elements:" + arrayList);
    }
}
package mergesort.util;


import mergesort.model.MergeSort;

public class StringUtil {

    public static void printArray(MergeSort elements) {
        System.out.println("Ordering strings");
        for (String s: elements.getSortingArray()) {
            System.out.println(s);
        }
    }
}

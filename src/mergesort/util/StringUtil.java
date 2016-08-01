package mergesort.util;


import mergesort.model.MergeSort;

public class StringUtil {

    public static void printArray(MergeSort elements) {
        for (String s: elements.getSortingArray()) {
            System.out.println(s);
        }
    }
}

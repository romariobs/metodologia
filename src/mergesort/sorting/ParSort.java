package mergesort.sorting;

import mergesort.model.ParallelMergeSort;
import mergesort.util.StringUtil;
import java.util.Arrays;
/**
 * Class main parallel mergesort.
 */
public class ParSort {
	static int NPARALLELSORT = 2;
    private static String mInputPath;
    private static String mOutputPath;

	public static void main(String[] args) throws Throwable {
        // int cores = Runtime.getRuntime().availableProcessors();
        ParallelMergeSort pms = new ParallelMergeSort(args,5);
        pms.sortArray();
        StringUtil.printArray(pms);
    }



}

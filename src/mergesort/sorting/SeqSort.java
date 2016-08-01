package mergesort.sorting;

import mergesort.model.SequentialMergeSort;
import mergesort.util.StringUtil;

/**
 * Class main sequential mergesort.
 */
public class SeqSort {
	public static void main(String[] args) {		//sequential
		SequentialMergeSort sms = new SequentialMergeSort(args);
		sms.sortArray();
		StringUtil.printArray(sms.getSortingArray());

	}


}

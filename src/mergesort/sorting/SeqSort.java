package mergesort.sorting;

import mergesort.model.SequentialMergeSort;
import mergesort.util.StringUtil;

/**
 * Class controller sequential mergesort.
 */
public class SeqSort {
	public static void main(String[] args) {		//sequential
		String[] randomArrayForSeq = {"Teste1", "Teste7", "Teste5", "Teste2"};
		SequentialMergeSort sms = new SequentialMergeSort(randomArrayForSeq);
		sms.sortArray();
		StringUtil.printArray(sms);

		System.out.println(" Sequential Finished");


	}


}

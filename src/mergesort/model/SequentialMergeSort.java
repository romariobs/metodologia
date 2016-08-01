package mergesort.model;

public class SequentialMergeSort extends MergeSort {

	public SequentialMergeSort(String[] unsortedArray) {
		super(unsortedArray);
	}

	@Override
	public void sortArray() {
		mergeSort(sortingArray);
	}

}

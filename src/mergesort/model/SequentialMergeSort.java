package mergesort.model;

/**
 * Sequential mergesort.
 */
public class SequentialMergeSort extends MergeSort {

	/**
	 * Constructs a sequential mergesort.
	 * @param unsortedArray The unsorted array.
     */
	public SequentialMergeSort(String[] unsortedArray) {
		super(unsortedArray);
	}

	@Override
	public void sortArray() {
		mergeSort(sortingArray);
	}

}

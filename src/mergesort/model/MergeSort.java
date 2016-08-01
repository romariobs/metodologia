package mergesort.model;

import java.util.Arrays;

public class MergeSort {

	protected String[] sortingArray;

	public MergeSort(String[] unsortedArray) {
		super();
		this.sortingArray = unsortedArray;
	}

	public void merge(String[] leftArray, String[] rightArray, String[] sortedArray) {
		int counter1 = 0;
		int counter2 = 0;
		for (int i = 0; i < leftArray.length + rightArray.length; i++) {
			if (counter2 >= rightArray.length
					|| (counter1 < leftArray.length && leftArray[counter1].compareTo(rightArray[counter2]) < 0)) { //left < right
				sortedArray[i] = leftArray[counter1];
				counter1++;
			} else {
				sortedArray[i] = rightArray[counter2];
				counter2++;
			}
		}

	}
	
	// It is O(N log N) for all inputs.
	public void mergeSort(String[] a) {
		if (a.length >= 2) {

			String[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			String[] right = Arrays.copyOfRange(a, a.length / 2, a.length);

			
			mergeSort(left);
			mergeSort(right);

			merge(left, right, a);
		}
	}

	public void sortArray() {
		
	}

	public String[] getSortingArray() {
		return sortingArray;
	}

}

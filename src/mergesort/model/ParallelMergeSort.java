package mergesort.model;

import java.util.Arrays;

/**
 * Parallel mergesort.
 */
public class ParallelMergeSort extends MergeSort {

	public int numberOfThreads;

	/**
	 * Constructs a parallel mergesort.
	 * @param unsortedArray The unsorted array.
	 * @param threads Number of threads.
     */
	public ParallelMergeSort(String[] unsortedArray, int threads) {
		super(unsortedArray);
		numberOfThreads = threads;
	}
    @Override
	public void sortArray() {
		if (numberOfThreads <= 1) {
			mergeSort(sortingArray);
		} else if (sortingArray.length >= 2) {
			// split array in half
			String[] leftArray = Arrays.copyOfRange(sortingArray, 0, sortingArray.length / 2);
			String[] rightArray = Arrays.copyOfRange(sortingArray, sortingArray.length / 2, sortingArray.length);
			numberOfThreads= numberOfThreads/2;
			Sorter leftSorter = new Sorter(leftArray, numberOfThreads);
			Thread leftThread = new Thread(leftSorter);
			Sorter rightSorter = new Sorter(rightArray, numberOfThreads);
			Thread rightThread = new Thread(rightSorter);
			leftThread.start();
			rightThread.start();
			try {
				leftThread.join();
				rightThread.join();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			merge(leftArray, rightArray, sortingArray);
		}

	}

}

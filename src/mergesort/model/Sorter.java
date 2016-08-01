package mergesort.model;

/**
 * Auxiliar parallel mergesort.
 */
public class Sorter extends ParallelMergeSort implements Runnable {
	public static int threadCounter=0;

	public Sorter(String[] unsortedArray, int threads) {
		super(unsortedArray, threads);
		threadCounter++;
	}

	@Override
	public void run() {
		sortArray();
	}

}

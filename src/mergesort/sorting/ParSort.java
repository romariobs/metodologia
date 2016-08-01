package mergesort.sorting;

import mergesort.model.ParallelMergeSort;
import mergesort.util.MathUtil;

public class ParSort {
	static int LENGTH = 1000;
	static int RUNS = 16;
	static int NPARALLELSORT = 8;
    private static String mInputPath;
    private static String mOutputPath;
	/*
	 * Number of threads = 2+4+8= 14
	 * 2^1 (dept=1) + 2^2 (dept=2) + 2^3 (dept=3)
	 * 
	 * 
	 * Produces 1000* 2 ^ RUNS element in every loop
	 * 
	 */

	public static void main(String[] args) throws Throwable {
        // int cores = Runtime.getRuntime().availableProcessors();
		/*for (int i = 1; i <= RUNS; i++) {

			// parallel
			String[] randomArrayForParallel = {"Teste1", "Teste3", "Teste5", "Teste2"};
			long startTimeParallel = System.currentTimeMillis();
			ParallelMergeSort pms = new ParallelMergeSort(randomArrayForParallel, NPARALLELSORT);
			pms.sortArray();
			long endTimeParallel = System.currentTimeMillis();
			// System.out.println(Arrays.toString(randomArrayForParallel));


			System.out.println(LENGTH + " elements");
			System.out.printf("=>  %6d ms \n", endTimeParallel - startTimeParallel);
			for (String s: pms.getSortingArray()) {
				System.out.println("sorting array: "+s);
			}

			LENGTH *= 2; // double size of array for next time
		}
		System.out.println("Parallel Finished");
	}*/

        switch (args.length) {
            case 1:
                mInputPath = args[0];
                break;
            case 2:
                mInputPath = args[0];
                mOutputPath = args[1];
                break;
            default:
                throw new RuntimeException("Quantidade de argumentos invalida");
        }

        if (args.length == 3) {
            mInputPath = args[1];
            mOutputPath = args[2];

        }
        System.out.println("RODOUUUUUUU GG");
    }



}

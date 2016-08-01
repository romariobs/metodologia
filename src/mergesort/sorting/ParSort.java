package mergesort.sorting;

/**
 * Class main parallel mergesort.
 */
public class ParSort {
	static int NPARALLELSORT = 2;
    private static String mInputPath;
    private static String mOutputPath;

	public static void main(String[] args) throws Throwable {
        // int cores = Runtime.getRuntime().availableProcessors();




        switch (args.length) {
            case 0:
                break;
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

        System.out.println("RODOUUUUUUU GG");

        System.out.println("Parallel Finished");
    }



}

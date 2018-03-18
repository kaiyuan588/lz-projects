package agm;

import java.util.Random;
import java.util.function.Function;

public class Main<X extends Comparable<X>> {

	public static void main(String[] args) {
		int m = 100; 
        Random r = new Random();
		Integer[] array = new Integer[1000];
        for(int i = 0; i < 1000; i++) {
        		array[i] = r.nextInt(999);
        }
        
        /*Warm up*/
        for(int i = 0; i < 10; i++) {  
        		Integer[] arraycopy = array;
        		Benchmark.benchmarkSort(arraycopy, 1000, "SelectionSort(WarmUp)", new SelectionSort<>(), m);
        		Benchmark.benchmarkSort(arraycopy, 1000, "InsertionSort(WarmUp)", new InsertionSort<>(), m);
        }
        System.out.println("---------------------------------------------------------------------");
        
        /*Random Array*/
        int randomN = 200;
        for (int i = 0; i < 5; i++) {
        		Integer[] arraycopy = array;
        		Benchmark.benchmarkSort(arraycopy, randomN*(i+1), "SelectionSort(Random Array)", new SelectionSort<>(), m);
        		Benchmark.benchmarkSort(arraycopy, randomN*(i+1), "InsertionSort(Random Array)", new InsertionSort<>(), m);
        }
        System.out.println("---------------------------------------------------------------------");
        
        /*Ordered Array*/
        for(int i = 0; i < 1000; i++) {
    			array[i] = i;
        }
        int orderedN = 200;
        for (int i = 0; i < 5; i++) {
        		Integer[] arraycopy = array;
        		Benchmark.benchmarkSort(arraycopy, orderedN*(i+1), "SelectionSort(Ordered Array)", new SelectionSort<>(), m);
        		Benchmark.benchmarkSort(arraycopy, orderedN*(i+1), "InsertionSort(Ordered Array)", new InsertionSort<>(), m);
        }
        System.out.println("---------------------------------------------------------------------");
        
        /*Reverse-Ordered Array*/
        for(int i = 0; i < 1000; i++) {
    			array[i] = 999 - i;
        }
        int reverseN = 200;
        for (int i = 0; i < 5; i++) {
        		Integer[] arraycopy = array;
        		Benchmark.benchmarkSort(arraycopy, reverseN*(i+1), "SelectionSort(Reverse-Ordered Array)", new SelectionSort<>(), m);
        		Benchmark.benchmarkSort(arraycopy, reverseN*(i+1), "InsertionSort(Reverse-Ordered Array)", new InsertionSort<>(), m);
        }
        System.out.println("---------------------------------------------------------------------");
        
        /*Partial-Ordered Array*/
        for(int i = 0; i < 500; i++) {
    			array[i] = i;
        }
        int partialN = 200;
        for (int i = 0; i < 5; i++) {
        		Integer[] arraycopy = array;
        		Benchmark.benchmarkSort(arraycopy, partialN*(i+1), "SelectionSort(Partially-Ordered Array)", new SelectionSort<>(), m);
        		Benchmark.benchmarkSort(arraycopy, partialN*(i+1), "InsertionSort(Partially-Ordered Array)", new InsertionSort<>(), m);
        }
    }
}
	
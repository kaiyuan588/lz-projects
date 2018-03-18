import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// Not here in origin file
import java.util.concurrent.ForkJoinPool;

class ParSort {
	public static int cutoff = 100000;
    public static int poolSize = 4; // The number of threads
    public static int arrayLength = 800000;
    public static int minSize = arrayLength/poolSize; // The size of array when the number of arrays equals to number of threads
    private static ExecutorService executor = Executors.newFixedThreadPool(poolSize); // Customizing the fixed thread pool
    
    public static void sort(int[] array, int from, int to) {
        int size = to - from;
        
        if (size < cutoff || size < 2 * minSize) Arrays.sort(array, from, to);
        //Two schemes: 1. size is less than cutoff; 2.half size is less than the minimum array size
        else {
        		System.out.println(executor); // Print out thread information
//        		System.out.println("Thread number: " + ForkJoinPool.commonPool().getActiveThreadCount());
            
        		CompletableFuture<int[]> parsort1 = parsort(array, from, (to+from)/2);
        		CompletableFuture<int[]> parsort2 = parsort(array, (to+from)/2, to);
        		CompletableFuture<int[]> parsort = parsort1.
                    thenCombine(parsort2, (xs1, xs2) -> {
                        int[] result = new int[xs1.length + xs2.length];
                        // Merge results of parsort1 and parsort2
                        int i1 = 0, i2 = 0, i = 0;
                        while (i1 < xs1.length && i2 < xs2.length) {
                        		if (xs1[i1] < xs2[i2]) {
                        			result[i] = xs1[i1];
                        			i++;
                        			i1++;
                        		} else {
                        			result[i] = xs2[i2];
                        			i++;
                        			i2++;
                        		}
                        }
                        
                        // Only one of these two for-loops gets executed
                        // Append remaining elements to result
                        for (int j = i1; j < xs1.length; j++) {
                        		result[i] = xs1[j];
                        		i++;
                        }
                        
                        for (int j = i2; j < xs2.length; j++) {
                        		result[i] = xs2[j];
                        		i++;
                        }
                        return result;
                    });

            parsort.whenComplete((result, throwable) -> {
            		// Apply changes to array
            		for (int i = from; i < to; i++) {
            			array[i] = result[i - from];
            		}
            });
            parsort.join();
        }
    }
    

    private static CompletableFuture<int[]> parsort(int[] array, int from, int to) {
        return CompletableFuture.supplyAsync(
                () -> {
                    int[] result = new int[to  - from];
                    
                    // Copy from array as Array is mutable
                    for (int i = from; i < to; i ++) {
                			result[i - from] = array[i];
                    }
                    ParSort.sort(result, 0, result.length);
                    return result;
                }
        ,executor);
    }
    
    public static void releaseThreadPool() {
    		executor.shutdown();
    }// release the thread pool created
}
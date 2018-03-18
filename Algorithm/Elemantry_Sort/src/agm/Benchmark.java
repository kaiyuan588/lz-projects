package agm;

import java.util.Random;
import java.util.function.Function;

public class Benchmark<X> {
	private Function<X,Void> f;
	
	
	public Benchmark (Function<X,Void> f) {
		this.f = f;
	}
	
	public static void benchmarkSort(Integer[] xs, Integer n, String name, Sort<Integer> sorter, int m) {
        Function<Integer, Void> sortFunction = (x) -> {
            sorter.sort(xs,0,n);
            return null;
        };
        Benchmark<Integer> bm = new Benchmark<>(sortFunction);
        double x = bm.run(xs, n, m, sorter);
        System.out.println(name + ": " + x + " millisecs for n=" + n);
    }
	
	public double run(Integer[] xs, int n, int m, Sort<Integer> sorter) {
		int i = 0;
		long st = System.nanoTime();
		while(i < m) {
			sorter.sort(xs,0,n);
			i++;
		}
		long et = System.nanoTime();
		double t = (double)((et-st)/(m));
		return t/1000000;
	}
}

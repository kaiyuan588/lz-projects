package agm;

public class InsertionSort<X extends Comparable<X>> extends Helper<X>{
	
	public InsertionSort() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public void sort(X[] xs, int from, int to) {
        // TODO implement selection sort
		for(int i = 1 + from; i < to; i++) {
			for(int j = i; j > 0 && less(xs[j],xs[j-1]); j--) {
				exchange(xs, j, j-1);
			}
		}
		
    }
}

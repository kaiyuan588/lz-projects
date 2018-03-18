package agm;

public class SelectionSort<X extends Comparable<X>> extends Helper<X>{
	
	public SelectionSort() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	@Override
    public void sort(X[] xs, int from, int to) {
        // TODO implement selection sort
		for(int i = from; i < to; i++) {
			int min = i;
			for(int j = i+1; j < to; j++) {
				if(less(xs[j], xs[min])) {
					min = j;
				}
				exchange(xs ,i ,min);
			}
		}
    }
}

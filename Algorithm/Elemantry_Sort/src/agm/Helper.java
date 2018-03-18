package agm;

public abstract class Helper<X extends Comparable<X>> implements Sort<X> {
	public void sort(X[] a, int from, int to) {}
	
	public boolean less (Comparable v, Comparable w) {
		return v.compareTo(w) <= 0 ;
	}
	
	public void exchange(Comparable[] a, int i, int j) {
		Comparable t = a[i]; 
		a[i] = a[j];
		a[j] = t;
	}
	
	public void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}

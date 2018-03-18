package agm;

public interface Sort<X extends Comparable<X>>  {
	/**
     * Generic sort method.
     *
     * @param xs sort the array xs in place
     */
	default void sort(X[] xs) {
        sort(xs, 0, xs.length);
    }
	
    public void sort(X[] xs, int from, int to);
}

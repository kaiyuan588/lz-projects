import java.util.Random;

public class Main {

    public static void main(String[] args) {
    		if (args.length>0) ParSort.cutoff = Integer.parseInt(args[0]);
        Random random = new Random(0L);
        int[] array = new int[ParSort.arrayLength];
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(10000);
        long a = System.currentTimeMillis();
        ParSort.sort(array, 0, array.length);
        long b = System.currentTimeMillis();
        System.out.println(b-a);
        ParSort.releaseThreadPool();
//        for (int i : array) System.out.println(i);
        if (array[0]==11) System.out.println("Success!");
//        int core = Runtime.getRuntime().availableProcessors();
//        System.out.println(core);
    	
    }
}
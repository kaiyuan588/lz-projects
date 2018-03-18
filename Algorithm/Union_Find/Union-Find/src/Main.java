import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double n1 = (double) n;
		double rst = Math.log(n1)*0.5*n1;
		UF uf = new UF(n);
		while (uf.group()!=1) {
			Random random = new Random();
		    int p = random.nextInt(n);
		    int q = random.nextInt(n);
		    if (uf.connected(p, q)) continue;
		    uf.union(p, q);
//		    System.out.println(uf.count());
		}
		System.out.println(uf.count() + " pairs");
		System.out.println(rst);
	}
	
}

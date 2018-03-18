package walkalgorithm;
import java.util.Random;

public class RandomWalk {
	private int x = 0;
    private int y = 0;

    private final Random random = new Random();

    public void move(int dx, int dy) {
        // TODO you need to implement this
    		x+=dx;
    		y+=dy;
    }

    private void randomWalk(int n) {
        for (int i = 0; i < n; i++){
        		randomMove();
        }
    }

    private void randomMove() {
        // TODO you need to implement this
    		int step = random.nextInt(3);
    		if (step==0) {
    			move(1,0);
    		}
    		if(step==1) {
    			move(0,-1);
    		}
    		if(step==2) {
    			move(-1,0);
    		}
    		if(step==3) {
    			move(0,1);
    		}
    }

    public double distance() {
        double dis = Math.sqrt((double)(x*x+y*y));
    		return dis; // TODO you need to implement this
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
        RandomWalk walk = new RandomWalk();
        walk.randomWalk(n);
        System.out.println(n + " steps: " + walk.distance());
	}

}

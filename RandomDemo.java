import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {

		Random myRandom = new Random();

		int rand = myRandom.nextInt(10);

		System.out.println("Ihren RandomZahlen ist:" + rand);

		int newRand = schreibeZufallszahl(20, 100, myRandom);

		System.out.println("Ihren RandomZahlen ist:" + newRand);

	}


	public static int schreibeZufallszahl(int min, int max, Random neuRandom) {
		int x;

		if (min > max) {
			int temp = min;
			min = max;
			max = temp;
		}
	
		x = neuRandom.nextInt(max - min + 1) + min;
	
		return x;
	}

}

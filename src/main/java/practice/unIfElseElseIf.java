package practice;

public class unIfElseElseIf {
	public static void checkScore(int x) {
		
		if (x < 10) {
			System.out.println("Score is too low!");
		} else if (x >= 10 && x < 50){
			System.out.println("Score is average.");
		} else {
			System.out.println("Score is high!");
		}
		
	}
}

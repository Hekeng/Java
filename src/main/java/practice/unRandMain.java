package practice;

import java.util.Random;

public class unRandMain {
	
	public static void main(String[] args) {
		
		Random myRandom = new Random();
		
		int rand = myRandom.nextInt(10);//Возвращает целое число от 0 до 9 включительно.
		
		System.out.println("Ihren RandomZahlen ist:" + rand);
		
		int newRand = unRand.randomNumber(20, 100, myRandom);
		
		System.out.println("Ihren RandomZahlen ist:" + newRand);
		
	}
	
}

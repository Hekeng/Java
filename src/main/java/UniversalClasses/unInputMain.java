// Что нужно считать	Проверка (Check)					Считывание (Read)	Тип данных
// Целое число			hasNextInt()						nextInt()			int
// Дробное число		hasNextDouble()						nextDouble()		double
// Одно слово			hasNext()	.isEmpty()				next()				String
// Вся строка			hasNextLine()	.trim().isEmpty()	nextLine()			String
// Логическое			hasNextBoolean()					nextBoolean()		boolean

package UniversalClasses;

import java.util.Scanner;

public class unInputMain {
	public static void main(String[] args) {
		// 1. Создание
		Scanner inputScanner = new Scanner(System.in); // ВАЖНО ПЕРЕНЕСТИ!!!!
		inputScanner.useLocale(java.util.Locale.US);// контролирует точку
		// 2. Передача
		System.out.println("Eingabe ihren Vorname:");
		String booschtabeAingabe = unInputStr.StringInput(inputScanner); // ВАЖНО ПЕРЕДАТЬ!!!!
		System.out.println("\nEingabe wie viel yahren haben Sie:");
		Integer zahlenAingabe = unInputInt.ZhalenInput(inputScanner);// ВАЖНО ПЕРЕДАТЬ!!!!
		System.out.println("\nEingabe Bruchzahl:");
		Double bruchzahlAingabe = unInputFloat.BruchzahlInput(inputScanner);
		
		System.out.println("Ihren Vorname ist:" + booschtabeAingabe);
		System.out.println("Ihren alter ist:" + zahlenAingabe);
		System.out.println("Ihren Bruchzahl ist:" + bruchzahlAingabe);
		
		// 3. Закрытие
		inputScanner.close(); // ВАЖНО ПЕРЕНЕСТИ!!!!
	}
}

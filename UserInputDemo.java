// Что нужно считать	Проверка (Check)					Считывание (Read)	Тип данных
// Целое число			hasNextInt()						nextInt()			int
// Дробное число		hasNextDouble()						nextDouble()		double
// Одно слово			hasNext()	.isEmpty()				next()				String
// Вся строка			hasNextLine()	.trim().isEmpty()	nextLine()			String
// Логическое			hasNextBoolean()					nextBoolean()		boolean


import java.util.Scanner; // ВАЖНО ПЕРЕНЕСТИ!!!!

public class UserInputDemo {
	public static void main(String[] args) {
		// 1. Создание
		Scanner inputScanner = new Scanner(System.in); // ВАЖНО ПЕРЕНЕСТИ!!!!
		inputScanner.useLocale(java.util.Locale.US);// контролирует точку
		// 2. Передача
		System.out.println("Eingabe ihren Vorname:");
		String booschtabeAingabe = demoStringInput(inputScanner); // ВАЖНО ПЕРЕДАТЬ!!!!
		System.out.println("\nEingabe wie viel yahren haben Sie:");
		Integer zahlenAingabe = demoZhalenInput(inputScanner);// ВАЖНО ПЕРЕДАТЬ!!!!
		System.out.println("\nEingabe Bruchzahl:");
		Double bruchzahlAingabe = demoBruchzahlInput(inputScanner);

		System.out.println("Ihren Vorname ist:" + booschtabeAingabe);
		System.out.println("Ihren alter ist:" + zahlenAingabe);
		System.out.println("Ihren Bruchzahl ist:" + bruchzahlAingabe);

		// 3. Закрытие
		inputScanner.close(); // ВАЖНО ПЕРЕНЕСТИ!!!!
	}

	public static String demoStringInput(Scanner inputScanner) {

		String analizAingabe = "";
		int ifValid = 0;
		

		do {

			int checkPrufung = 1;

			analizAingabe = inputScanner.nextLine();

			//uberprufung lear eingabe

			if (analizAingabe.trim().isEmpty()) {
				System.out.println("Eingabe solen hat booschtaben nischt lear, bitte noch einmall ein");
				ifValid = 0;
				continue;
			}
			
			//uberprufung chahlen
		
			for (int i = 0; i < analizAingabe.length(); i++) {
				char currentC = analizAingabe.charAt(i);
				if (Character.isDigit(currentC)){
					
					System.out.println("Eingabe solen hat booschtaben nischt lear, bitte noch einmall ein");
					checkPrufung = 0;
					break;
				}
			}

			if (checkPrufung == 1) {
				ifValid = 1;
			}
			

		} while (ifValid == 0);

		return analizAingabe;
	}

	public static int demoZhalenInput(Scanner inputScanner) {
				// --- 2. Input int ---
		int analizAingabe;

		while (!inputScanner.hasNextInt()) {
		System.out.println("Fehler: Eingabe bitte eine richtige ganze Zahl ein:");
		inputScanner.next();
		}
		analizAingabe = inputScanner.nextInt();

		inputScanner.nextLine();// очистка буфера
		return analizAingabe;
	}

	public static double demoBruchzahlInput(Scanner inputScanner) {

	double analizAingabe;

		while (true) {
			System.out.print("Eingabe Bruchzahl: ");

			if (!inputScanner.hasNextDouble()) {
				System.out.println("Fehler: Eingabe bitte eine richtige Bruchzahl ein:");
				inputScanner.next();
				continue;
			}

			analizAingabe = inputScanner.nextDouble();
			inputScanner.nextLine();

			if (analizAingabe % 1.0 == 0.0) {
				System.out.println("Fehler: Eingabe bitte eine richtige Bruchzahl ein Beispiel (5.5):");
				continue;
			}

			return analizAingabe;
		}
	}
}
package UniversalClasses;

import java.util.Scanner;

public class unInputFloat {
	public static double BruchzahlInput(Scanner inputScanner) {
		
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

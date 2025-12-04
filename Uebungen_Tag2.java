// public class Main { // erste Klasse des Programms. Sie Beinhaltet die Main-Methode wo alles Ausgeführt wird
//     public static void main(String[] args) {  // Die main-Methode muss public static void main(String[] args) sein um das Programm auszuführen

//         // System.out.println("Hallo Welt!");
//         // System ist eine Klasse. Sie beinhaltet die variable "out" welche ein Objekt der Klasse "PrintStream" ist
//         // Ein Objekt ist ein konkreter Gegenstand einer Instans einer Klasse.
//         // Das Objekt "out" verfügt über die Methode ( Funktion ) "println".

//         int zahl1 = 1;// 1
//         System.out.println(zahl1);
//         zahl1 = zahl1 + 1;  // 2
//         System.out.println(zahl1);
//         zahl1 = zahl1 + 1;  // 2
//         System.out.println(zahl1);
//         zahl1 = zahl1 + 1;  // 2
//         System.out.println(zahl1);
//         zahl1 = zahl1 + 1;  // 2
//         System.out.println(zahl1);
//         zahl1 = zahl1 + 1;  // 2
//         System.out.println(zahl1);



//         int zahl2 = 56;
//         int result = zahl1 + zahl2;
//         System.out.println(result);

//         // Automatisierte erhöhung um + 1
//         for(int b = 1; b <= 6; b++){ // + 1 = b++
//             System.out.println(b);
//         }


//         int alter = 10;
//         String alterString = "Jahre jung";
//         System.out.println(alter + " " + alterString);
//         System.out.printf("%d %s \n", alter,  alterString);



//     }
// }

// ++++++++++++++
// ++++++++++++++


import java.util.Random;

public class Uebungen_Tag2 {

    public static void main(String[] args){

        // Deklarartion und Initialisierung von sechs Ganzzahlen (int) mit festen Werten
        int i1 = 3, i2 = 11, i3 = 15, i4 = 17, i5 = 33, i6 = 42;

        // Ausgabe der sechs Werte von Ganzzahlen auf der Konsole
        System.out.println("1. Zahl: " + i1);
        System.out.println("2. Zahl: " + i2);
        System.out.println("3. Zahl: " + i3);
        System.out.println("4. Zahl: " + i4);
        System.out.println("5. Zahl: " + i5);
        System.out.println("6. Zahl: " + i6);

        // Leerzeile zur besseren Lesbarkeit der Ausgabe
        System.out.println();

        // Deklaration eines Arrays mit der Größe 6 zur speicherung von Ganzzahlen
        int[] myArray = new int[6];   // Ein Array erstellen das Platz für 6 Ganzzahlen hat

        // Wie zählt das Array???? => es fängt bei Null an.  1. Position ist im Array = myArray[0];
        // Die 2. Position ist im Array = myArray[1]; und so weiter.......

        // Erstellen eines Random-Objekts zur Generierung zufälliger Zahlen
        Random random = new Random();

        // Schleife zur Befüllung des Arrays mit sechs zufälligen Ganzzahlen (0-99)
        for(int i = 0; i < 6; i++){ // Diese Schleife läuft 6 Mal durch, von 0 bis 5
            myArray[i] = random.nextInt(100); // Zufallszahl zwischen 0 und 99 erszeugen und im Array an der Stelle i speichern
        }

        // Schleife zur Ausgabe der Werte im Array auf der Konsole
        for(int i = 0; i < 6; i++){// Diese Schleife läuft 6 Mal durch, von 0 bis 5
            System.out.println((i + 1) + ". Zahl: " + myArray[i]); // Ausgabe der Zahl aus dem Array an der Stelle i, mit ( i + 1 ) für die nummerierte Ausgabe
        }

        // Erstellen einer Kontrollstrucktur in JAVA

        int zahl1 = 20;

        if (zahl1 == 20){
            System.out.println("Ja, die Zahlen sind gleich.");
        }
        else
        {
            System.out.println("Die Zahlen sind Unterschiedlich.");
        }


    }

}



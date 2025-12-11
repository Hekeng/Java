// Действие				Метод							Назначение												Возвращаемый тип
// Длина				length()						Возвращает количество символов в строке.				int
// Сравнение			equals(String other)			Сравнивает содержимое строк (использовать вместо ==)	boolean
// Изменение регистра	toUpperCase() / toLowerCase()	Переводит строку в верхний / нижний регистр.			String
// Проверка начала		startsWith(String prefix)		Проверяет, начинается ли строка с префикса				boolean
// Замена				replace(char old, char new)		Заменяет все вхождения символа на другой.				String
// Обрезание			trim()							Удаляет пробелы в начале и конце строки.				String
package oldPractice;
import java.util.ArrayList; // ВАЖНО ПЕРЕНЕСТИ!!!!

public class StringsDemo {
	public static void main(String[] args) {
		ArrayList <String> neuStringList = new ArrayList<>();// ВАЖНО ПЕРЕНЕСТИ!!!!
		neuStringList.add("Oleg");
		neuStringList.add("Alex");
		strLang(neuStringList);
		//convertToUppercase(neuStringList);
		//nameAutput(neuStringList);
	}

//получаем строку из масива

	public static void strLang(ArrayList<String> nameList) {

		for (int i = 0; i < nameList.size(); i++) {
			int lang = nameList.get(i).length();
			System.out.println("Lange of string number" + i + " = " + lang);
			slowFunc(150);
		}
		
	}

	public static void convertToUppercase(ArrayList<String> nameList) {

		
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println("Name #" + i + " is " + nameList.get(i));
			slowFunc(150); //замедляем вывод
			String capitalName = nameList.get(i);
			capitalName = capitalName.toUpperCase();
			nameList.set(i, capitalName);
			slowFunc(150);//замедляем вывод
			System.out.println("Name #" + i + " is " + nameList.get(i));

		}
	}

	public static void nameAutput(ArrayList<String> nameList) {
		
	
		for (String name : nameList) {
			
			System.out.println("Lange of string number = " + name);
			slowFunc(150);
			
		}
	}
// замедляем вывод
	public static void slowFunc (int delayMilliseconds){
		try {
			Thread.sleep(delayMilliseconds);
		}
		catch (InterruptedException e) {
			// B учебных целях, мы можем проигнорировать
		}
	}
}
	

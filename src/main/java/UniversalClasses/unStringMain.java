// Действие				Метод							Назначение												Возвращаемый тип
// Длина				length()						Возвращает количество символов в строке.				int
// Сравнение			equals(String other)			Сравнивает содержимое строк (использовать вместо ==)	boolean
// Изменение регистра	toUpperCase() / toLowerCase()	Переводит строку в верхний / нижний регистр.			String
// Проверка начала		startsWith(String prefix)		Проверяет, начинается ли строка с префикса				boolean
// Замена				replace(char old, char new)		Заменяет все вхождения символа на другой.				String
// Обрезание			trim()							Удаляет пробелы в начале и конце строки.				String

package UniversalClasses;

import java.util.ArrayList;

public class unStringMain {
	public static void main(String[] args) {
		ArrayList<String> neuStringList = new ArrayList<>();// ВАЖНО ПЕРЕНЕСТИ!!!!
		neuStringList.add("Oleg");
		neuStringList.add("Alex");
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Oleg");
		names.add("Alex");
		
		// Получаем массив длин
		int[] lengths = unString.getStringLengths(names);
		for (int i = 0; i < lengths.length; i++) {
			System.out.println("Length of string #" + i + " = " + lengths[i]);
			unSlow.slowFunc(150);
		}
		
		// Преобразуем в верхний регистр
		unString.convertToUppercase(names);
		
		// Печать списка
		unString.printNames(names);
	}
	
}


// Действие				Метод / Поле		Назначение															Тип данных
// Из строки в int		parseInt(String s)	Преобразует строку (например, "42") в примитив int.					int
// Из int в String		toString(int i)		Преобразует примитив int в строку (например, 42 в "42").			String
// Максимум				MAX_VALUE			Хранит наибольшее возможное значение для int (около 2.1 миллиарда).	int
// Минимум				MIN_VALUE			Хранит наименьшее возможное значение для int (отрицательное).		int
package practice;

public class unSwitchMain {
	public static void main(String[] args) {
		
		String textNumber = "42";
		int score = Integer.parseInt(textNumber);//конвертация String → int через метод
		
		unIfElseElseIf.checkScore(score);
		
		int maxVal = Integer.MAX_VALUE;//присвоение константы
		String maxString = Integer.toString(maxVal);
		
		System.out.println("Umbigest int is :" + maxString);//В Java нельзя напрямую конкатенировать int и String без преобразования, хотя println делает это автоматически
		
		unSwitchStruct.analise(3);
	}
}

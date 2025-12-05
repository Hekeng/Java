// Действие				Метод / Поле		Назначение															Тип данных
// Из строки в int		parseInt(String s)	Преобразует строку (например, "42") в примитив int.					int
// Из int в String		toString(int i)		Преобразует примитив int в строку (например, 42 в "42").			String
// Максимум				MAX_VALUE			Хранит наибольшее возможное значение для int (около 2.1 миллиарда).	int
// Минимум				MIN_VALUE			Хранит наименьшее возможное значение для int (отрицательное).		int

public class IntegerSwitchDemo {

	public static void main(String[] args) {
		String textNumber = "42";
		int score = Integer.parseInt(textNumber);

		checkScore(score);

		int maxVal = Integer.MAX_VALUE;
		String maxString = Integer.toString(maxVal);

		System.out.println("Umbigest int is :" + maxString);

	}

	public static void checkScore(int x) {

		if (x < 10) {
			System.out.println("Score is too low!");
		} else if (x >= 10 && x < 50){
			System.out.println("Score is average.");
		} else {
			System.out.println("Score is high!");
		}
		
	}

	public static void checkLevel(int level) {
		switch (level) {
			case 1:
				// Код, если level == 1
				System.out.println("Level 1: Basic");
				break; // !!! Важно: останавливает выполнение switch
	
			case 2:
			case 3:
				// Код, если level == 2 ИЛИ level == 3
				System.out.println("Level 2-3: Intermediate");
				break;
	
			default:
				// Код для всех остальных случаев
				System.out.println("Level is unknown");
				// break здесь необязателен, так как это последний блок
		}

//=============================Современный вариант:=======================================

		String result = switch (level) {
			case 1 -> "Level 1: Basic";
			case 2, 3 -> "Level 2-3: Intermediate"; // Объединение через запятую
			default -> "Level is unknown";
		};
		System.out.println(result);
	}
	
}
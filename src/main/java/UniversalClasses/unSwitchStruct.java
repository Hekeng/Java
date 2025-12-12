package UniversalClasses;

public class unSwitchStruct {
	public static void analise (int level) {
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

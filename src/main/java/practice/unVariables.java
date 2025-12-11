// Действие				Метод / Поле		Назначение															Тип данных
// Из строки в int		parseInt(String s)	Преобразует строку (например, "42") в примитив int.					int
// Из int в String		toString(int i)		Преобразует примитив int в строку (например, 42 в "42").			String
// Максимум				MAX_VALUE			Хранит наибольшее возможное значение для int (около 2.1 миллиарда).	int
// Минимум				MIN_VALUE			Хранит наименьшее возможное значение для int (отрицательное).		int

package practice;
import java.util.ArrayList;

public class unVariables {
	public static void main(String[] args) {

		demoVariables ();
	}


	public static void demoVariables () {
		// Объявление переменных
		int age = 25;
		Integer intObj = 25;
		char c = 'A';
		Character cObj = 'A';
		String name = "Oleg";
		double pi = 3.14;
		Double dObj = 3.14;
		boolean isDone = true;
		Boolean bObj = true;
		
		final double PI = 3.1415; //обьявление константы
		final int MIN_AGE = 18;//Локальная (только внутри метода):
		//static final double TAX_RATE = 0.07;//Константа класса (статическая):
		//public static final String COMPANY_NAME = "OpenAI";//Публичная статическая (доступна другим классам):
		
		int [] numbers = {10, 20, 30};
		int third = numbers[2];
		
		String[] arr = new String[5]; //правильное обьявление пустого масива
		String[] strArr = {"Oleg", "Alex"};
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Oleg");
		strList.add("Alex");
		
		ArrayList<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		

		// Вывод примитивных переменных
		System.out.println("--- Вывод примитивных типов ---");
		System.out.println("Переменная age = " + age);
		System.out.println("Переменная name = " + name);
		System.out.println("Переменная pi = " + pi);
		System.out.println("Переменная isDone = " + isDone);
		System.out.println("Переменная third (индекс 2) = " + third);
		System.out.println("--------------------------------");
		
		System.out.println("App: " + Config.APP_NAME);//вызов публичной константы

		// Улучшенный цикл c использованием .length
		for (int i = 0; i < numbers.length; i++) {

			System.out.println("Переменная numbers #" + i + " = " + numbers[i]);
			unSlow.slowFunc (150);
		}
		System.out.println("...Готово!");
	}
	
	//Константа класса (статическая, доступная всем):
	public class Config {
		public static final int MAX_USERS = 100;
		public static final String APP_NAME = "MyApp";
	}

}

public class VarDemo_univ_sleep {
  
    public static void main(String[] args) {
        
		demoVariables ();
    }


	public static void demoVariables () {
        // Объявление переменных
        int age = 25;
        String name = "Oleg";
        double pi = 3.14;
        boolean isDone = true;
        int [] numbers = {10, 20, 30};
        int third = numbers[2];

        // Вывод примитивных переменных
        System.out.println("--- Вывод примитивных типов ---");
        System.out.println("Переменная age = " + age);
        System.out.println("Переменная name = " + name);
        System.out.println("Переменная pi = " + pi);
        System.out.println("Переменная isDone = " + isDone);
        System.out.println("Переменная third (индекс 2) = " + third);
        System.out.println("--------------------------------");

        // Улучшенный цикл c использованием .length
        for (int i = 0; i < numbers.length; i++) {
            
            System.out.println("Переменная numbers #" + i + " = " + numbers[i]);
            slowFunc (150);
    	}
		System.out.println("...Готово!");
	}


	public static void slowFunc (int delayMilliseconds){
		try {
			Thread.sleep(delayMilliseconds);
		}
		catch (InterruptedException e) {
			// B учебных целях, мы можем проигнорировать
		}
	}
}

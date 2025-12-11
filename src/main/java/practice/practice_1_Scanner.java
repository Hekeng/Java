package src.main.java.practice;// 1. Импортируем класс Scanner из пакета java.util
import java.util.Scanner;

public class practice_1_Scanner {
    
    public static void main(String[] args) {
        
        // --- 1. Ввод Пользователя (Создание объекта Scanner) ---
        // Scanner - это "инструмент" для считывания ввода.
        Scanner scanner = new Scanner(System.in);
        
        // --- 2. Запрос и Чтение Первого Числа ---
        System.out.println("Введите первое целое число:");
        
        // Объявление переменной (int) и присвоение результата метода nextInt()
        int number1 = scanner.nextInt();
        
        // --- 3. Запрос и Чтение Второго Числа ---
        System.out.println("Введите второе целое число:");
        int number2 = scanner.nextInt();

        // --- 4. Обработка и Вывод ---
        int sum = number1 + number2;
        
        // Вывод c использованием конкатенации (+)
        System.out.println("Сумма чисел: " + sum);
        
        // --- 5. Закрытие Scanner ---
        // Освобождаем системный ресурс, это хорошая практика
        scanner.close();
    }
}
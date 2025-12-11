package practice;

import java.util.ArrayList;
public class unString {
	// =========================
	// Получаем массив длин всех строк
	// Вход: ArrayList<String>
	// Выход: int[] длин строк
	// =========================
	public static int[] getStringLengths(ArrayList<String> list) {
		int[] lengths = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			lengths[i] = list.get(i).length();
		}
		return lengths;
	}
	
	// =========================
	// Преобразуем все строки списка в верхний регистр
	// Вход: ArrayList<String>
	// Выход: void (изменяет список на месте)
	// =========================
	public static void convertToUppercase(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}
	}
	
	// =========================
	// Печать всех строк
	// Вход: ArrayList<String>
	// Выход: void
	// =========================
	public static void printNames(ArrayList<String> list) {
		for (String name : list) {
			System.out.println(name);
		}
	}
}

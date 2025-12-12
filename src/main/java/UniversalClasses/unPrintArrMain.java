package UniversalClasses;

import java.util.ArrayList;

public class unPrintArrMain {
    public static void main(String[] args) {
        // Создаем динамический список, хранящий объекты Integer
        ArrayList<Integer> integerList = new ArrayList<>();// ВАЖНО ПЕРЕНЕСТИ!!!!

        String[] arr = new String[5]; //правильное обьявление масива

        integerList.add(95); // Добавить элемент
        integerList.add(88);

        System.out.println("Первый элемент: " + integerList.get(1));

        ArrayList <String> neuStringList = new ArrayList<>();// ВАЖНО ПЕРЕНЕСТИ!!!!
        neuStringList.add("Oleg");
        neuStringList.add("Alex");
        unPrintArr.printArrList(neuStringList);
    }
}

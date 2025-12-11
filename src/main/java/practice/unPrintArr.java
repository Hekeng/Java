package practice;

import java.util.ArrayList;

public class unPrintArr {
    public static void printArrList(ArrayList<?> newArrayList) {

        // Улучшенный цикл c использованием .length

        for (int i = 0; i < newArrayList.size(); i++) {

            System.out.println("Переменная numbers #" + i + " = " + newArrayList.get(i));
            unSlow.slowFunc(150);
        }
        System.out.println("...Готово!");

    }
}
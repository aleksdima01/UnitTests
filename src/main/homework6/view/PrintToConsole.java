package homework6.view;

import static homework6.controller.Сontroller.listNum;

public class PrintToConsole {

    public void print() {
        if (listNum == 1)
            System.out.println("Первый список имеет большее среднее значение!");
        else if (listNum == -1)
            System.out.println("Второй список имеет большее среднее значение!");
        else
            System.out.println("Средние значения списков равны");
    }
}

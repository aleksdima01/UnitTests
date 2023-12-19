package homework6.view;


public class PrintToConsole {

    public void print(int listNum) {
        if (listNum == 1)
            System.out.println("Первый список имеет большее среднее значение!");
        else if (listNum == -1)
            System.out.println("Второй список имеет большее среднее значение!");
        else if (listNum == 0)
            System.out.println("Средние значения списков равны!");
        else
            System.out.println("Ошибка вывода!");
    }
}

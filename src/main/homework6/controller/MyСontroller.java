package homework6.controller;

import homework6.model.ListComparator;
import homework6.model.MyList;
import homework6.view.PrintToConsole;


public class MyСontroller {

    public void run() {
        int listNum;
        MyList myList1 = new MyList(15);
        MyList myList2 = new MyList(15);
        System.out.println(myList1.getList());
        System.out.println(myList2.getList());
        ListComparator listComparator = new ListComparator();
        listNum = listComparator.compare(myList1, myList2);
        PrintToConsole printToConsole = new PrintToConsole();
        printToConsole.print(listNum);
    }
}

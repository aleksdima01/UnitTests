package homework6.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyList {
    ArrayList<Integer> list;

    public MyList(Integer number) {
        Random random = new Random();
        list = new ArrayList<Integer>(number);
        for (int i = 0; i < number; i++)
            list.add(random.nextInt(0, 100));
    }

    public MyList(List<Integer> newlist) {
        list = new ArrayList<Integer>();
        list.addAll(newlist);
    }


    public double getAvg() {
        double sum = 0;
        double result;
        for (int el : list) {
            sum += el;
        }
        result = sum / list.size();
        if (Double.isNaN(result) || Double.isInfinite(result))
            throw new ArithmeticException("Неправильные параметры массивов");
        else
            return result;
    }


    public ArrayList<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "" + list;
    }

    public int compareTo(MyList o2) {
        return Double.compare(this.getAvg(), o2.getAvg());
    }
}

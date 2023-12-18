package homework6.model;

import java.util.Comparator;

public class ListComparator implements Comparator<MyList> {

    @Override
    public int compare(MyList o1, MyList o2) {
        return o1.compareTo(o2);
    }

}

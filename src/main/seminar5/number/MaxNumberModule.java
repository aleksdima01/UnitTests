package seminar5.number;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MaxNumberModule {

    public Integer getMax(ArrayList<Integer> array) {
        Integer max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) {
                max = array.get(i);
            }
        }
        return max;
    }
}

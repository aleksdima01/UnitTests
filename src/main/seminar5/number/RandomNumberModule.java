package seminar5.number;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberModule {

    public ArrayList<Integer> generate(int i) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            list.add(random.nextInt(0, 100));
        }
        return list;
    }
}

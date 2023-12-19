package homework6.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchException;
import static org.junit.jupiter.api.Assertions.*;


class MyListTest {
    MyList list;

    @BeforeEach
    void prepare() {
        list = new MyList(5);
    }

    @Test
    void testGetAvg() {
        MyList newList = new MyList(Arrays.asList(1, 2, 3, 4, 5));
        double result = newList.getAvg();
        assertEquals(3, result);
    }

    @Test
    void testNoGetAvg() {
        MyList newList = new MyList(0);
        Exception exception = assertThrows(ArithmeticException.class, newList::getAvg);

        assertEquals("Неправильные параметры массивов", exception.getMessage());
    }

    @Test
    void testGetList() {
        assertThat(list.getList()).isNotEmpty().isNotNull().hasSize(5);
    }

    @Test
    void testToString() {
        MyList newList = new MyList(Arrays.asList(1, 2, 3, 4, 5));
        String result = newList.toString();
        assertEquals("[1, 2, 3, 4, 5]", result);
    }

    @Test
    void testCompareTo() {
        MyList newList1 = new MyList(Arrays.asList(1, 2, 3, 4, 5));
        MyList newList2 = new MyList(Arrays.asList(1, 2, 3, 4, 4));
        int result = newList1.compareTo(newList2);
        assertEquals(1, result);
    }
}
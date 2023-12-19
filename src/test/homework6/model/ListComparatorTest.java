package homework6.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ListComparatorTest {

    @Test
    void testCompare() {
        ListComparator listComparator = new ListComparator();
        MyList newList1 = new MyList(Arrays.asList(1, 2, 3, 4, 5));
        MyList newList2 = new MyList(Arrays.asList(1, 2, 3, 4, 4));
        int result = listComparator.compare(newList1, newList2);
        assertEquals(1, result);
    }

    @Test
    void integrationTest() {
        ListComparator listComparator = new ListComparator();
        MyList mockList1 = mock(MyList.class);
        MyList mockList2 = mock(MyList.class);
        int result = listComparator.compare(mockList1, mockList2);
        assertEquals(0, result);
    }
}
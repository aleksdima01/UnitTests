package seminar4.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book;

    @BeforeEach
    void setUp() {
        book = new Book("1", "Утраченный символ", "Дэн Браун");
    }

    @Test
    void getId() {
        assertEquals("1", book.getId());
    }

    @Test
    void setId() {
        book.setId("2");
        assertEquals("2", book.getId());
    }

    @Test
    void getTitle() {
        assertEquals("Утраченный символ", book.getTitle());
    }

    @Test
    void setTitle() {
        book.setTitle("3 Поросенка");
        assertEquals("3 Поросенка", book.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("Дэн Браун", book.getAuthor());
    }

    @Test
    void setAuthor() {
        book.setAuthor("Александр Блок");
        assertEquals("Александр Блок", book.getAuthor());
    }
}
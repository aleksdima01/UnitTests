package seminar4.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book;
    Book book1;

    @BeforeEach
    void setUp() {

        book = new Book("1", "Утраченный символ", "Дэн Браун");
        book1 = new Book("2");
    }

    @Test
    void getId() {
        assertEquals("1", book.getId());
    }

    @Test
    void setId() {
        book1.setId("3");
        assertEquals("3", book1.getId());
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
package seminar4.book;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    @Test
    void integrationTestFindBookById() {
        Book book = new Book("1", "Book1", "Author1");
        InMemoryBookRepository inMemoryBookRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(inMemoryBookRepository);

        when(bookService.findBookById("1")).thenReturn(new Book("1", "Book1", "Author1"));
        Book result = bookService.findBookById("1");

        assertThat(result.toString()).isEqualTo(book.toString());
    }

    @Test
    void integrationTestFindAllBooks() {
        Book book = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
        List<Book> mylist = new ArrayList<>();
        List<Book> mylist2;
        mylist.add(book);
        mylist.add(book2);
        InMemoryBookRepository inMemoryBookRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(inMemoryBookRepository);

        when(bookService.findAllBooks()).thenReturn(new ArrayList<>(Arrays.asList(book, book2)));
        mylist2 = bookService.findAllBooks();

        assertEquals(mylist2, mylist);
    }
}
import com.gmail.slartua.book.model.*;
import com.gmail.slartua.book.model.entity.Book;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBookModel {
    public static BooksModel model;
    public Book[] actual;
    public Book[] expected;

    @BeforeClass
    public static void init(){
        model  = new BooksModel();
    }

    @Test
    public void testGetByAuthor(){
        model.setBooks(TestData.booksDataTest);
        actual = model.getByAuthor("Shevchenko");
        expected = TestData.booksDataResultGetByAuthor;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetByPublisher(){
        model.setBooks(TestData.booksDataTest);
        actual = model.getByPublisher("ABB");
        expected = TestData.booksDataResultGetByPublisher;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFromYear(){
        model.setBooks(TestData.booksDataTest);
        actual = model.getFromYear(2003);
        expected = TestData.booksDataResultGetFromyear;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSortByPublisher(){
        model.setBooks(TestData.booksDataTest);
        actual = model.sortByPublisher();
        expected = TestData.booksDataSortByPublisher;
        Assert.assertEquals(expected, actual);
    }

}

import com.gmail.slartua.book.model.entity.Book;

public class TestData {
    public final static Book[] booksDataTest =
            new Book[] {
                    new Book("Title1", "Shevchenko", "ABB", 2001, 102, 42.12),
                    new Book("Title2", "Franko", "BBC", 2002, 12, 87.85),
                    new Book("Title3", "Lesya", "ABB", 2003, 15, 87.12),
                    new Book("Title4", "Skovoroda", "NBC", 2004, 223, 487.17)
            };
    public final static Book[] booksDataResultGetByAuthor =
            new Book[] {
                    new Book("Title1", "Shevchenko", "ABB", 2001, 102, 42.12)
            };
    public final static Book[] booksDataResultGetByPublisher =
            new Book[] {
                    new Book("Title1", "Shevchenko", "ABB", 2001, 102, 42.12),
                    new Book("Title3", "Lesya", "ABB", 2003, 15, 87.12)
            };
    public final static Book[] booksDataResultGetFromyear =
            new Book[] {
                    new Book("Title3", "Lesya", "ABB", 2003, 15, 87.12),
                    new Book("Title4", "Skovoroda", "NBC", 2004, 223, 487.17)
            };
    public final static Book[] booksDataSortByPublisher =
            new Book[] {
                    new Book("Title1", "Shevchenko", "ABB", 2001, 102, 42.12),
                    new Book("Title3", "Lesya", "ABB", 2003, 15, 87.12),
                    new Book("Title2", "Franko", "BBC", 2002, 12, 87.85),
                    new Book("Title4", "Skovoroda", "NBC", 2004, 223, 487.17)
            };
}

public class Book {
    //attributes
    private int bookYear;
    private String bookName;
    protected Author author;

    //constructor
    public Book(int bookYear, String bookName, Author author) {
    this.bookYear = bookYear;
    this.bookName = bookName;
    this.author = author;

    }
    public String getBookName() {
        return this.bookName;
    }
    public int getBookYear() {
        return this.bookYear;
    }
    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
}

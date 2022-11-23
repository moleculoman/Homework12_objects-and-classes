public class Book {
    //attributes
    private int bookYear;
    private String bookName;

    //constructor
    public Book(int bookYear, String bookName) {
    this.bookYear = bookYear;
    this.bookName = bookName;

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

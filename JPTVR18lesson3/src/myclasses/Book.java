package myclasses;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookDesc;
    private int bookIsbn;

    public Book(){
        this.bookName = "none";
        this.bookAuthor = "none";
        this.bookDesc = "none";
        this.bookIsbn = 1234;
    }

    public Book(String bookName, String bookAuthor, String bookDesc, int bookIsbn){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookDesc = bookDesc;
        this.bookIsbn = bookIsbn;

    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public int getBookIsbn() {
        return bookIsbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public void setBookIsbn(int bookIsbn) {
        this.bookIsbn = bookIsbn;
    }
}

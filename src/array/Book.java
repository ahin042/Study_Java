package array;

public class Book {
    // 멤버 변수 선언
    private String bookName;
    private String author;

    // 생성자
    public Book() {
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String showInfo() {
        return bookName + ", " + author;
    }
}

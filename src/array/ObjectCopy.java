package array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book[] bookCopy = new Book[5];

        books[0] = new Book("태백산맥", "조정래");
        books[1] = new Book("데미안", "헤르만 헤세");
        books[2] = new Book("연을 쫓는 아이", "할레드 호세이니");
        books[3] = new Book("토지", "박경리");
        books[4] = new Book("어린왕자", "생택쥐페리");
        System.arraycopy(books, 0, bookCopy, 0, books.length);

        System.out.println("books");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].showInfo());
        }

        System.out.println("bookCopy");
        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i] = new Book();
        }

        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i].setBookName(books[i].getBookName());
            bookCopy[i].setAuthor(books[i].getAuthor());
        }

        System.out.println("bookCopy");
        for (int i = 0; i < bookCopy.length; i++) {
            System.out.println(bookCopy[i].showInfo());
        }
    }
}

package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] booklist = new Book[5];
        Book[] bookCopy = new Book[5];

        booklist[0] = new Book("태백산맥", "조정래");
        booklist[1] = new Book("데미안", "헤르만 헤세");
        booklist[2] = new Book("연을 쫓는 아이", "할레드 호세이니");
        booklist[3] = new Book("토지", "박경리");
        booklist[4] = new Book("어린왕자", "생택쥐페리");

        System.out.println("booklist 배열의 정보 출력");
        for (int i = 0; i < booklist.length; i++) {
            System.out.println(booklist[i].showInfo());
        }

        System.arraycopy(booklist, 0, bookCopy, 0, booklist.length);

        System.out.println("bookCopy 배열의 정보 출력");
        for (int i = 0; i < bookCopy.length; i++) {
            System.out.println(bookCopy[i].showInfo());
        }

        booklist[0].setBookName("해리포터");
        booklist[0].setAuthor("J.K. 롤링");

        System.out.println("booklist 배열의 정보 출력");
        for (int i = 0; i < booklist.length; i++) {
            System.out.println(booklist[i].showInfo());
        }

        System.out.println("bookCopy 배열의 정보 출력");
        for (int i = 0; i < bookCopy.length; i++) {
            System.out.println(bookCopy[i].showInfo());
        }
    }
}

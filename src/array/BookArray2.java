package array;

public class BookArray2 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();

        book1.setBookName("태백산맥");
        book1.setAuthor("조정래");

        book2.setBookName("데미안");
        book2.setAuthor("헤르만 헤세");

        book3.setBookName("연을 쫓는 아이");
        book3.setAuthor("할레드 호세이니");

        book4.setBookName("토지");
        book4.setAuthor("박경리");

        book5.setBookName("어린왕자");
        book5.setAuthor("생택쥐페리");

        System.out.println(book1.showInfo());
        System.out.println(book2.showInfo());
        System.out.println(book3.showInfo());
        System.out.println(book4.showInfo());
        System.out.println(book5.showInfo());

    }
}

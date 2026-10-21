package array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("태백산맥", "조정래"));
        bookList.add(new Book("토지", "박경리"));
        bookList.add(new Book("연을 쫓는 아이", "할레드 호세이니"));
        bookList.add(new Book("해리포터", "J.K. 롤링"));

        // bookList.get(0).showInfo();

        // for (int i = 0; i < bookList.size(); i++) {
        //     bookList.get(i).showInfo();
        // }

        for (Book i : bookList) {
            i.showInfo();
        }

        bookList.remove(2);
        System.out.println("세번째 항목 제거 후");
        for (Book i : bookList) {
            i.showInfo();
        }

        bookList.removeAll(bookList);
        System.out.println("모든 항목 제거 후");
        for (Book i : bookList) {
            i.showInfo();
        }

        System.out.println("배열이 비었는지 확인 : " + bookList.isEmpty());
    }
}
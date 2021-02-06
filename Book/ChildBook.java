package Book;

import Book.Book;

public class ChildBook implements Book {

    private String title;
    private int price;

    public ChildBook(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public long get_price() {
        return Math.round(price * 0.9);
    }

    public void display_book_info() {
        System.out.println("─ Child Book.Book Info ──────────────");
        System.out.println("책 제목 : " + this.title);
        System.out.println("책 가격 : " + this.price);
    }
}

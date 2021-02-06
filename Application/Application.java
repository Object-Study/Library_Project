package Application;

import Book.Book;
import Customer.Customer;

import java.util.Arrays;
import java.util.List;

public class Application {

    private List<Book> bookList;
    private Customer customer;

    // 데이터 베이스에서 책 정보와 손님 정보를 가져옴
    public Application(Customer customer, Book ... books) {
        this.customer = customer;
        this.bookList = Arrays.asList(books);
    }

    public void print_book_info() {
        for(Book books: bookList) {
            books.display_book_info();
        }
    }
}


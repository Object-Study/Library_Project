import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {
    private List<Book> basket;
    private PaymentMethod paymentMethod;

    public Basket(PaymentMethod method, Book ... books) {
        this.basket = Arrays.asList(books);
        this.paymentMethod = method;
    }

    public int pay() {
        return paymentMethod.calculateDiscountFee(calculateFee());
    }

    private int calculateFee() {
        int total_fee = 0;
        for(Book each : basket) {
            each.print_book_info();
            total_fee += each.get_price();
        }
        return total_fee;
    }
}

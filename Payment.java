import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Payment {
    private List<Book> basket = new ArrayList<Book>();
    private Method method;

    public Payment(Method method, Book ... books) {
        this.basket = Arrays.asList(books);
        this.method = method;
    }

    public int final_payment() {
        return method.pay(calculateFee());
    }

    private int calculateFee() {
        int total_fee = 0;
        for(Book each : basket) {
            total_fee += each.get_price();
        }
        return total_fee;
    }
}
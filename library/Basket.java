package library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import money.Money;

public class Basket {
    private List<Book> basket = new ArrayList<>();
    private Money total_price;

    public Basket(Book ... books) {
        this.basket = Arrays.asList(books);
    }

    public Money CalculatePrice() {
        
        for (int i=0; i<basket.size(); i++) {
            total_price.plus(basket.get(i).getPrice());
        }

        return total_price;
    }
}

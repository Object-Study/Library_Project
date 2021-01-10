package library;

import money.Money;

public abstract class Book {
    private Money price;

    public Book(Money price) {
        this.price = price;
    }

    public Money getPrice() {
        return price;
    }
}

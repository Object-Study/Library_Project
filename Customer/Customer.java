package Customer;

import Book.Book;
import PaymentMethod.PaymentMethod;

public class Customer {
    private Basket basket;
    private PaymentMethod paymentMethod;
    private int mileage;

    public Customer(PaymentMethod paymentMethod, int mileage, Book... books) {
        this.basket = new Basket(books);
        this.paymentMethod = paymentMethod;
        this.mileage = mileage;
    }

    public void pay() {
        basket.pay(paymentMethod);
    }

    private void set_mileage(int mileage) {
        this.mileage += mileage;
    }
}
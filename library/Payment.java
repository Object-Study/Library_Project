package library;

import money.Money;

public abstract class Payment {
    private Money total_payment;


    abstract protected void calculateDiscountPrice(Basket basket);
}

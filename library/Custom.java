package library;

import money.Mileage;
import money.Money;

public class Custom {

    private Basket basket;
    private Payment payment;
    private Money mileage;

    public Custom(Basket basket, Payment payment) {
        this.basket = basket;
        this.payment = payment;
    }
    
    private void GetMileage(Basket basket) {
        mileage.plus(payment.calculateDiscountPrice(basket));
    }
}

package Payment;

import library.Basket;
import library.Payment;
import money.Money;

public class GiftCard extends Payment{
    private Money giftcard_info;

    GiftCard(Money giftcard_info) {
        this.giftcard_info = giftcard_info;
    }

    public Money calculateDiscountPrice(Basket basket) {
        return basket.CalculatePrice().minus(giftcard_info);
    }
}

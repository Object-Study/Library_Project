package Payment;

import library.Basket;
import library.Payment;
import money.Money;

public class Card extends Payment{
    private String card_info;

    Card(String card_info) {
        this.card_info = card_info;
    }

    public Money calculateDiscountPrice(Basket basket) {
        if(is_AffiliatedCard()) return basket.CalculatePrice().times(0.1);
        else return basket.CalculatePrice();
    }

    private boolean is_AffiliatedCard() {
        return true;
    }
}

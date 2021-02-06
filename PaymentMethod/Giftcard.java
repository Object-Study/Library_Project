package PaymentMethod;

import PaymentMethod.PaymentMethod;

public class Giftcard implements PaymentMethod {
    private String giftcard;
    private int giftprice;

    public Giftcard(String giftcard, int giftprice) {
        this.giftcard = giftcard;
        this.giftprice = giftprice;
    }

    @ Override
    public int calculateDiscountFee(int price) {
        System.out.println("할인된 금액 : " + (price - giftprice));
        return price - giftprice;
    }
}

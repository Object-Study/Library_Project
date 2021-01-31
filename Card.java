public class Card implements PaymentMethod {
    private String card;
    private Double discount;

    public Card(String card, Double discount) {
        this.card = card;
        this.discount = discount;
    }

    @ Override
    public int calculateDiscountFee(int price) {
        System.out.println("할인된 금액 : " + price * discount);
        price = (int) Math.round(price * (1-discount));
        return price;
    }
}

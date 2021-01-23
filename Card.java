public class Card implements Method {
    private String card;
    private Double discount;

    public Card(String card, Double discount) {
        this.card = card;
        this.discount = discount;
    }

    @ Override
    public int pay(int price) {
        price = (int) Math.round(price * (1-discount));
        return price;
    }
}

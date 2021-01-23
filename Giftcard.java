public class Giftcard implements Method{
    private String giftcard;
    private int giftprice;

    public Giftcard(String giftcard, int giftprice) {
        this.giftcard = giftcard;
        this.giftprice = giftprice;
    }

    @ Override
    public int pay(int price) {
        price = price - giftprice;
        return price;
    }
}

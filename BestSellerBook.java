public class BestSellerBook implements Book {

    private String title;
    private int price;

    public BestSellerBook(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public long get_price() {
        return Math.round(price * 0.95);
    }

    public void print_book_info() {
        System.out.println("─ Best Seller Info ──────────────");
        System.out.printf("책 제목 : ", this.title, "\n");
        System.out.printf("책 가격 : ", this.price, "\n");
    }
}

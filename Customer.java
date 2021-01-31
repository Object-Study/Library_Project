public class Customer {
    private Basket basket;
    private int mileage;

    public Customer(PaymentMethod method, int mileage, Book ... books) {
        this.basket = new Basket(method, books);
        this.mileage = mileage;
    }

    public void pay() {
        basket.pay();
    }

    private void set_mileage(int mileage) {
        this.mileage += mileage;
    }
}
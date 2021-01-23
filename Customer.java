public class Customer {
    private int mileage;

    public Customer(int mileage) {
        this.mileage = mileage;
    }

    public void set_mileage(int mileage) {
        this.mileage += mileage;
    }
}
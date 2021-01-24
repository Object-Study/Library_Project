public class Customer {
    private Payment payment;
    private int mileage;

    public Customer(Method method, int mileage, Book ... books) {
        this.payment = new Payment(method, books);
        this.mileage = mileage;
    }

    public void get_pay() {
        int total_pay = payment.final_payment();
        int set_mileage = (int) Math.round(total_pay * 0.1);
        set_mileage(set_mileage);

    }

    private void set_mileage(int mileage) {
        this.mileage += mileage;
    }
}
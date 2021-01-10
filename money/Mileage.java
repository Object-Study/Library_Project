package money;

import java.math.BigDecimal;
import java.util.Objects;

public class Mileage {
    public static final Mileage ZERO = Mileage.wons(0);

    private final BigDecimal amount;

    public static Mileage wons(long amount) {
        return new Mileage(BigDecimal.valueOf(amount));
    }

    public static Mileage wons(double amount) {
        return new Mileage(BigDecimal.valueOf(amount));
    }

    Mileage(BigDecimal amount) {
        this.amount = amount;
    }

    public Mileage plus(Mileage amount) {
        return new Mileage(this.amount.add(amount.amount));
    }

    public Mileage minus(Mileage amount) {
        return new Mileage(this.amount.subtract(amount.amount));
    }

    public Mileage times(double percent) {
        return new Mileage(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public boolean isLessThan(Mileage other) {
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Mileage other) {
        return amount.compareTo(other.amount) >= 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Mileage)) {
            return false;
        }

        Mileage other = (Mileage)object;
        return Objects.equals(amount.doubleValue(), other.amount.doubleValue());
    }

    public int hashCode() {
        return Objects.hashCode(amount);
    }

    public String toString() {
        return amount.toString() + "원";
    }
}

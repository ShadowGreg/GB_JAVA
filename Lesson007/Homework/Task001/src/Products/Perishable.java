package Products;

public class Perishable extends Product {
    private final String expireDate;

    public Perishable(String name, double cost, String expireDate) {
        super(name, cost);
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Годен до -> %s ", expireDate);
    }
}

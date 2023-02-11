package Products;

public class Gum extends Product {
    private Taste taste;

    public Gum(String name, double cost, Taste taste) {
        super(name, cost);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Со вкусом %s", taste);
    }
}


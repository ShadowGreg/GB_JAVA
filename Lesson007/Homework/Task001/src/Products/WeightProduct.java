package Products;

public class WeightProduct extends Product {
    private final double weight;

    public WeightProduct(String name, double cost, double weight) {
        super(name, cost);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Вес товара -> %.2fг.", weight);
    }
}

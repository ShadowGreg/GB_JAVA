package Products;

public class Product {

    private final String name;
    private final int cost;
    private final float volume;

    public Product() {
        this("0", 0, 0f);
    }

    public Product(String name, int cost, float volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }


    @Override
    public String toString() {

        return String.format("Продукт %s по цене %dр. %.2f гр/л", name, cost, volume);
    }

    @Override
    public boolean equals(Object obj) {
        return (this.name.equals(((Product) obj).name) && this.cost == (((Product) obj).cost));
    }

    @Override
    public int hashCode() {
        return name.hashCode() +  cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public float getVolume() {
        return volume;
    }
}

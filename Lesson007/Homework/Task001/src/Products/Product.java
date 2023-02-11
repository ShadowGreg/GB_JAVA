package Products;

public class Product {

    private final String name;

    private final double cost;

    private String loadDate;

    public Product() {
        this("0", 0);
    }

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }


    public void setLoadDate(String loadDate) {
        this.loadDate = loadDate;
    }

    @Override
    public String toString() {
        return String.format("Продукт -> '%s' цена %.2fр. Дата загрузки -> %s", name, cost, loadDate);
    }


    @Override
    public boolean equals(Object obj) {
        return (this.name.equals(((Product) obj).name) && this.cost == (((Product) obj).cost));
    }

    @Override
    public int hashCode() {
        return name.hashCode() + (int) cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}

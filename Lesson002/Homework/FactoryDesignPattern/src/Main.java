public class Main {
    public static void main(String[] args) {
        SimpleCoffeeFactory af = new SimpleCoffeeFactory();
        CoffeeShop littleCoffeeShop = new CoffeeShop(af);

        littleCoffeeShop.orderCoffee(CoffeeType.ESPRESSO);
    }
}
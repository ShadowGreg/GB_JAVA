public class Espresso extends Coffee {
    @Override
    public void makeCoffee() {
        super.makeCoffee();
        System.out.println("Завариаем душистый эспрессо! МММ");
    }
}

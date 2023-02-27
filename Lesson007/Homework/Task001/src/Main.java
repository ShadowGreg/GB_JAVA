import Device.VendingMachine;
import Products.*;

public class Main {
    public static void main(String[] args) {
/**
 * добавила воду питьевую,минеральную и бутерброды
 * добавила параметр Volume для всех продуктов
 * удалила дату срока хранения, т.к в моем автомате
 * товар не залеживается
 * и продала один бутерброд
 */
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100, 150));
        machine.addProduct(new Product("Mars", 70, 60));
        machine.addProduct(new Product("Twix", 72, 60));
        machine.addProduct(new Product("Алёнка", 90, 90));
        machine.addProduct(new Product("Колокольчик", 85, 1.5f));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85, 0.97f));
        machine.addProduct(new Perishable("Молоко Коровка", 95, 1.0f));
        machine.addProduct(new Perishable("Молоко Василёк", 50, 0.2f));
        machine.addProduct(new Liquid("Вода минеральная Evian негазированная", 120, 0.5f));
        machine.addProduct(new Liquid("Вода питьевая Святой Источник газированная", 50, 0.5f));
        machine.addProduct(new Liquid("Вода питьевая Aqua Minerale Juicy Лимон", 80, 0.5f));
        machine.addProduct(new Sandwich("Бутерброд с индейкой, сыром и помидором", 250, 200));
        machine.addProduct(new Sandwich("Бутерброд с курицей и соусом терияки", 250, 200));
        machine.addProduct(new Sandwich("Буррито с растительным фаршем", 180, 155));

        System.out.println(machine);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(machine.findProduct("Молоко"));
        System.out.println(machine.findProduct("Алёнка"));
        System.out.println(machine.findProduct("Пиво"));
        System.out.println("----------------------------------------------------------------------");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("----------------------------------------------------------------------");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Бутерброд с курицей и соусом терияки").get(0)));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(machine);


    }
}
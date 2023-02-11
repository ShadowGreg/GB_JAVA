import Device.VendingMachine;
import Products.*;

import java.util.Date;

public class Main {
    private static final int DATE_JDC_CONS_COUNT = 1900;
    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100));
        machine.addProduct(new Product("Mars", 70));
        machine.addProduct(new Product("Twix", 70.99));
        machine.addProduct(new Product("Алёнка", 90));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85,
                machine.getDateFormat().format(new Date((2023 - DATE_JDC_CONS_COUNT), 1, 28))));
        machine.addProduct(new Perishable("Молоко Коровка", 85,
                machine.getDateFormat().format(new Date((2023 - DATE_JDC_CONS_COUNT), 1, 28))));
        machine.addProduct(new Perishable("Молоко Василёк", 85,
                machine.getDateFormat().format(new Date((2023 - DATE_JDC_CONS_COUNT), 1, 28))));
        machine.addProduct(new WeightProduct("Кофе молотый Жокей", 350,280));
        machine.addProduct(new WeightProduct("Кофе молотый Egoist", 645,250));
        machine.addProduct(new WeightProduct("Кофе молотый Bushido", 449,250));
        machine.addProduct(new Gum("Жвачка Love Is", 449, Taste.banana));
        machine.addProduct(new Gum("Жвачка Wrigley's Hubba Bubba Mega Long", 325, Taste.cola));

        System.out.println(machine);
        System.out.println("__________________________________");
        System.out.println(machine.findProduct("Молоко"));
        System.out.println(machine.findProduct("Алёнка"));
        System.out.println(machine.findProduct("Пиво"));
        System.out.println("__________________________________");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("__________________________________");
        System.out.println(machine);
        System.out.println("__________________________________");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Bubba").get(0)));
        System.out.println("__________________________________");
        System.out.println(machine);


    }
}
package Entitys;

public class Notebook implements Computer {
    private Integer RAM;
    private Integer HD;
    private String OS;
    private String color;
    private Integer price;

    public Notebook(Integer RAM, Integer HD, String OS, String color, Integer price) {
        this.RAM = RAM;
        this.HD = HD;
        this.OS = OS;
        this.color = color;
        this.price = price;
    }

    public Notebook(String inputComputer) {
        String[] splitParams = inputComputer.split(" ");
        int RAM = 1;
        int HD = 4;
        int OS = 7;
        int color = 9;
        int price = 11;
        this.RAM = Integer.parseInt(splitParams[RAM]);
        this.HD = Integer.parseInt(splitParams[HD]);
        this.OS = splitParams[OS];
        this.color = splitParams[color];
        this.price = Integer.parseInt(splitParams[price]);
    }

    @Override
    public void setPrise(Integer inputPrice) {
        this.price = inputPrice;
    }

    @Override
    public Integer getPrise() {
        return price;
    }

    @Override
    public String getComputer() {
        return String.format("ОЗУ: %d Мб, ЖД: %d Гб, ОС: %s Цвет: %s Цена: %d р.\n", RAM, HD, OS, color, price);
    }

    @Override
    public String toString() {
        return String.format("ОЗУ: %d Мб, ЖД: %d Гб, ОС: %s Цвет: %s Цена: %d р.\n", RAM, HD, OS, color, price);
    }
}

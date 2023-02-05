package Entitys;

import java.util.*;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Store {
    List<Computer> store = new ArrayList<Computer>();

    public Store() {
        Integer computerQuantity = 10_000;
        for (int i = 0; i <= computerQuantity; i++) {
            store.add(new ComputerListController().getNewComputer());
        }
    }

    public List<Computer> getComputersFromStore() {
        return store;
    }

}

class ComputerListController {
    List<Object> RAM = Arrays.asList(
            32,
            64,
            128,
            8,
            2,
            4,
            12
    );
    List<Object> HD = Arrays.asList(
            128,
            8,
            2,
            4,
            12,
            1000,
            500,
            250
    );
    List<Object> OS = Arrays.asList(
            "Linux",
            "Windows",
            "OS X",
            "DOS"
    );
    List<Object> Color = Arrays.asList(
            "RED",
            "White",
            "Blue",
            "Black"
    );

    public Computer getNewComputer() {
        Integer RAM = (Integer) getParam(this.RAM);
        Integer HD = (Integer) getParam(this.HD);
        String OS = (String) getParam(this.OS);
        String color = (String) getParam(this.Color);
        Integer price = getPrice();
        return new Notebook(RAM, HD, OS, color, price);
    }

    private Integer getPrice() {
        int min = 15_000;
        int max = 500_000;
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private Object getParam(List<Object> inputList) {
        return inputList.get(getNumber(inputList));
    }

    private int getNumber(List<Object> inputList) {
        int min = 0;
        int max = inputList.size();
        return ThreadLocalRandom.current().nextInt(min, max);

    }

}





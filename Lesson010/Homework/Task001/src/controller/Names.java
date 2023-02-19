package controller;

import java.util.Random;

public class Names {
    private Random rnd = new Random();

    public String getName() {
        return nameSwitcher(rnd.nextInt(6));
    }

    private String nameSwitcher(int nextInt) {
        switch (nextInt) {
            case 0:
                return "Abrehemus";
            case 1:
                return "Avgust";
            case 2:
                return "Avgustin";
            case 3:
                return "Avdikiy";
            case 4:
                return "Averkiy";
            case 5:
                return "Avitus";
            default:
                return "Avreliy";
        }
    }


}

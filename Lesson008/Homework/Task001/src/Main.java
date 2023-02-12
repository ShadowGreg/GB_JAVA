import view.View;
import model.Zoo;
import model.herbivores.Cow;
import model.herbivores.Duck;
import model.herbivores.Goat;
import model.herbivores.Turtle;
import model.predators.Crocodile;
import model.predators.Leo;
import model.predators.Shark;
import model.radio.Radio;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> animalsList = List.of(
                new Cow("Мурка"),
                new Crocodile("Гена"),
                new Leo("Симба - Леопольд"),
                new Goat("Маруська"),
                new Duck("Дональд Дак"),
                new Shark("Глат"),
                new Turtle("Тартила")
        );
        Zoo zoo = new Zoo(animalsList, new Radio());

        View.printZoo(animalsList);
        View.printChampion(zoo.getRunChampion());
        View.printChampion(zoo.getFlightChampion());
        View.printChampion(zoo.getSwimChampion());
    }
}
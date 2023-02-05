import model.Bulldogka;
import model.InfoSystem;
import model.PresentationArchive;
import model.ShowTime;

public class Main {
    public static void main(String[] args) {
        Bulldogka dog1 = new Bulldogka("Котик", "перс");
        Bulldogka dog2 = new Bulldogka("Кротик", "мопс");
        Bulldogka dog3 = new Bulldogka("Абармотик", "дог");
        PresentationArchive archive = new PresentationArchive();
        InfoSystem system = new InfoSystem();


        dog1.isCondition();
        dog2.isCondition();
        dog3.isCondition();

        archive.addBuldogca(dog1, 3);
        archive.addBuldogca(dog2, 1);
        archive.addBuldogca(dog3, 2);

        archive.toSeeArchive();

        system.addBuldogca(dog1, new ShowTime("1", "2", "3"));
        system.addBuldogca(dog3, new ShowTime("1", "2", "3"));

        system.toSeeArchive();

    }
}
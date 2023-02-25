import model.Model;
import model.Sum;
import presenter.Presenter;
import view.View;

public class Main {
    public static void main(String[] args) {
        Presenter<Model, View> presenter = new Presenter(new View(), new Sum());
        System.out.println("Hello world!");
        presenter.buttonClick();
    }
}
package presenter;

import model.Model;
import view.View;

public class Presenter<T1 extends Model, T2 extends View> {
    private View view;
    private Model model;


    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void buttonClick(){
        double a = view.setValue(" a> ");
        double b = view.setValue(" b> ");
        model.setFirstNum(a);
        model.setSecondNum(b);
        double result = model.getResult();
        view.printResult("Результат", model.name,"равен", result);
    }
}

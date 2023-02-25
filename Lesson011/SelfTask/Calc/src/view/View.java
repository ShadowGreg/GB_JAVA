package view;

import java.util.Scanner;

public class View implements Viewable {
    Scanner in = new Scanner(System.in);

    @Override
    public double setValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    @Override
    public void printResult(String title, String name, String text, double num) {
        System.out.printf("%s %s %s %f", title, name, text, num);
    }
}

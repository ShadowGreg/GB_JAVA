package Entity;


import java.util.ArrayList;
import java.util.List;

public class Figure {
    private List<Point2D> dotList = new ArrayList<Point2D>();

    /**
     * Конструктор фигуры по коодинатам     *
     * @param inputCoordinates List<Point2D>
     */
    public Figure(List<Point2D> inputCoordinates) {
        this.dotList = inputCoordinates;
    }

    /**
     * Пустой конструктор фигуры по координатам по умолчанию получает одну точку с координатам 0, 0
     */
    public Figure() {
        this.dotList.add(new Point2D());
    }
}

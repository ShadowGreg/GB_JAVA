package Entity;

import Operations.Length;

public class Point2D {

    private int x, y;

    /**
     * Полный конструктор
     *
     * @param inputX координата X
     * @param inputY Координата Y
     */
    public Point2D(int inputX, int inputY) {
        this.x = inputX;
        this.y = inputY;
    }

    /**
     * Усечённый конструктор по одной переменной
     *
     * @param inputValue вводимое значение
     */
    public Point2D(int inputValue) {
        this(inputValue, inputValue);
    }

    /**
     * Пустой конструктор по умолчанию точка будет с координатами 0, 0
     */
    public Point2D() {
        this(0);
    }

    /**
     * @return возвращает текстовое значение объекта
     */
    @Override
    public String toString() {
        return getInfo();
    }

    /**
     * @return возвращает текстовое значение объекта
     */
    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }


    /**
     * @return возвращает координату X в int
     */
    public int getX() {
        return x;
    }

    /**
     * @return возвращает координату Y в int
     */
    public int getY() {
        return y;
    }

    /**
     * получить длину отрезка между двумя точками
     * @param firstPoint первая точка типа Point2D
     * @param secondPoint вторая точка типа Point2D
     * @return возвращает расстояние между точками типа double
     */
    public static double getDistance(Point2D firstPoint, Point2D secondPoint){
        return new Length(firstPoint,secondPoint).getLength();
    }

}

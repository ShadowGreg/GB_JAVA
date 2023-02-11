package Operations;

import Entity.Point2D;

public class Length {
    private Point2D firstPoint;
    private Point2D secondPoint;

    /**
     * Полный конструктор длины отрезка по двум точкам
     *
     * @param inputFirstPoint  начало отрезка
     * @param inputSecondPoint конец отрезка
     */
    public Length(Point2D inputFirstPoint, Point2D inputSecondPoint) {
        this.firstPoint = inputFirstPoint;
        this.secondPoint = inputSecondPoint;
    }

    /**
     * Усечённый конструктор длины отрезка по одной точке, вторая считается из начала координат
     *
     * @param inputPoint вводимая точка
     */
    public Length(Point2D inputPoint) {
        this(inputPoint, new Point2D());
    }

    /**
     * Пустой конструктор по умолчанию длина равна нулю
     */
    public Length() {
        this(new Point2D(), new Point2D());
    }

    /**
     * Возвращает длину типа double из созданного экземпляра отрезка
     *
     * @return
     */
    public double getLength() {
        return Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(), 2) + Math.pow(firstPoint.getY() - secondPoint.getY(), 2));
    }
}

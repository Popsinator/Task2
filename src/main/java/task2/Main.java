package task2;

public class Main {
    public static void main(String[] args) {

        Square square = new Square("Квадрат", 5);

        Rectangle rectangle = new Rectangle("Прямоугольник", 3, 7);

        CorrectHexagon hexagon = new CorrectHexagon("Правильный шестиугольник", 6);

        showResult(square, rectangle, hexagon);

    }

    public static void showResult(Square square, Rectangle rectangle, CorrectHexagon hexagon) {
        System.out.println("Имена фигур: " + square.getName() + "   " + rectangle.getName() + "   " + hexagon.getName());
        System.out.println("Периметры:   " + square.getPerimeter() + "        " + rectangle.getPerimeter()
                + "              " + hexagon.getPerimeter());
        System.out.println("Площади:     " + square.getSquare() + "        " + rectangle.getSquare()
                + "              " + hexagon.getSquare());
    }
}
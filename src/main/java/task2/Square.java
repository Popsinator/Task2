package task2;

/**
 * Квадрат.
 * P = 4a;
 * S = a * a;
 */
public class Square implements Figura {

    String name;

    int a;

    public Square(String name, int a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public int getPerimeter() {
        return 4 * a;
    }

    @Override
    public int getSquare() {
        return a * a;
    }

    @Override
    public String getName() {
        return name;
    }
}

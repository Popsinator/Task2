package task2;

/**
 * Прямоугольник.
 * P = 2(a + b).
 * S = a * b.
 */
public class Rectangle implements Figura {

    String name;

    int a;

    int b;

    public Rectangle(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    @Override
    public int getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public int getSquare() {
        return a * b;
    }

    @Override
    public String getName() {
        return name;
    }
}

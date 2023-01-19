package task2;

import static java.lang.Math.sqrt;

/**
 * В данном классе реализую правильный шестиугольник.
 * P = 6 * a;
 * S = a * a * 3 * sqrt(3)/2
 */
public class CorrectHexagon implements Figura {

    String name;
    private int a;

    public CorrectHexagon(String name, int a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public int getPerimeter() {
        return a * 6;
    }

    @Override
    public int getSquare() {
        return (int) (a * a * 3 * sqrt(3)/2);
    }

    @Override
    public String getName() {
        return name;
    }
}

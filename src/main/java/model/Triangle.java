package model;

import java.awt.*;

public class Triangle extends AbstractFigure {

    private final int[] x = {200, 50, 350};
    private final int[] y = {50, 350, 350};
    private final int number;

    private final float area;
    private final float perimeter;

    private final Color color;


    public Triangle() {
        number = x.length;
        area = calculateArea();
        perimeter = calculatePerimeter();
        color = new Color(0, 127, 255);
    }

    @Override
    public int[] getXCoordinates() {
        return x;
    }

    @Override
    public int[] getYCoordinates() {
        return y;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public float getArea() {
        return area;
    }

    @Override
    public float getPerimeter() {
        return perimeter;
    }

    @Override
    public Color getColor() {
        return color;
    }

    /**
     * Method calculate area of triangle using coordinates of three vertex
     * Used formula: area = |((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3))| / 2,
     * where x(x1, x2, x3) and y(y1, y2, y3).
     *
     * @return Area of the triangle.
     */
    private float calculateArea() {
        float s1;
        float s2;

        s1 = (x[0] - x[2]) * (y[1] - y[2]);
        s2 = (x[1] - x[2]) * (y[0] - y[2]);

        return Math.abs(s1 - s2) / 2;
    }

    private float calculatePerimeter() {
        float perimeter = 0;

        // Calculate the sum of the tree lengths of the sides triangle
        for (int i = 0; i < x.length; i++) {
            int xDif = Math.abs(x[(i + 1) % 3] - x[i]);
            int yDif = Math.abs(y[(i + 1) % 3] - y[i]);

            float side = (float) Math.sqrt(xDif * xDif + yDif * yDif);

            perimeter += side;
        }

        return perimeter;
    }
}

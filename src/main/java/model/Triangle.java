package model;

import java.awt.*;

public class Triangle extends AbstractFigure {

    private final int[] x;
    private final int[] y;
    private final int number;

    private final float area;
    private final float perimeter;

    private Color color;
    private int shift = 0;

    public Triangle(int[] x, int[] y) {
        this.x = x;
        this.y = y;
        this.number = x.length;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
        this.color = generateColor();
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

    public Color updateColor() {
        Color nextColor = generateColor();
        this.color = nextColor;
        return nextColor;
    }

    /**
     * The color generation algorithm uses a shift of RGP parameters.
     * The colors are set by a cyclic sequence: shift (current) = 2 * shift (pred) + 1;
     *
     * @return Color The return value is a new color.
     */
    private Color generateColor() {

        int r;
        int g;
        int b;

        // Set RGB parameters
        r = (x[0] * y[0] + shift) % 256;
        g = (x[1] * y[1] + shift) % 256;
        b = (x[2] * y[2] + shift) % 256;

        Color newColor = new Color(r, g, b);

        // Changing the shift value
        shift = 2 * shift + 1;
        if (shift > 255) {
            shift = 0;
        }

        return newColor;
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

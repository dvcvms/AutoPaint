package model;

import java.awt.*;

public class Rectangle extends AbstractFigure {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int[] getXCoordinates() {
        return new int[] {x, x+width, x+width, x};
    }

    @Override
    public int[] getYCoordinates() {
        return new int[] {y, y, y+height, y+height};
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public float getArea() {
        return width*height;
    }

    @Override
    public float getPerimeter() {
        return 2 * (width+height);
    }
}

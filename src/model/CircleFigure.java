package model;

import java.awt.Color;

public class CircleFigure extends AbstractFigure {
    protected int x;
    protected int y;
    protected int height;
    protected int width;
    private final Color color;


    public CircleFigure(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.height = radius;
        this.width = radius;

        this.color = (color);
    }

    public int getX() {
        return this.x;
    }

    @Override
    public Color getColor() {
        if (width % 2 == 0)
            return Color.blue;
        else
            return Color.green;
    }

    public int getY() {
        return this.y;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.sqrt(width));
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * width);
    }

    @Override
    public int[] getXCoordinates() {
        return new int[]{x - width, x, x + width};
    }

    @Override
    public int[] getYCoordinates() {
        return new int[]{y - width, y, y + width};
    }


}

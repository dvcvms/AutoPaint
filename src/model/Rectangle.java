package model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.awt.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Rectangle extends AbstractFigure {
    private int x = 0;
    private int y = 0;
    private int width = 0;
    private int height = 0;
    private Color color = null;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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

    private Color generateColor() {
        if (width < 256)
            return Color.red;
        else if (height < 256)
            return Color.green;
        else
            return Color.blue;
    }

    @Override
    public Color getColor() {
        if (color != null) return color;
        else return generateColor();
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

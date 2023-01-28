package model;

import java.awt.*;

public class SquareFigure extends AbstractFigure {
    int[] X = new int[]{50, 50, 250, 250};
    int[] Y = new int[]{50, 250, 250, 50};
    int n = X.length;
    Color color = Color.blue;

    @Override
    public int[] getXCoordinates() {
        return X;
    }

    @Override
    public int[] getYCoordinates() {
        return Y;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public float getArea() {
        return (X[3] - X[0]) ^ 2;
    }

    @Override
    public float getPerimeter() {
        return ((X[3] - X[0]) + (Y[1] - Y[0])) * 2;
    }

}

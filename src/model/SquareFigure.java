package model;
import java.awt.*;

public class SquareFigure extends AbstractFigure {
    private int[] X = new int[4];
    private int[] Y = new int[4];
    private int[] rgmb_val = new int[4];
    private int n = X.length;
    public SquareFigure(int[] x, int[] y){
        X = x;
        Y = y;
    }

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
        int h = 0;
        for (int i = 0; i < 4; i++) {
            h = (X[i] + Y[i]) % 255;
            rgmb_val[i] = h;
        }
        Color color = new Color(rgmb_val[0], rgmb_val[1], rgmb_val[2], rgmb_val[3]);
        return color;
    }

    @Override
    public float getArea() {
        return (float) Math.pow((X[3]-X[0]),2);
    }

    @Override
    public float getPerimeter() {
        return ((X[3]-X[0])+(Y[1]-Y[0]))*2;
    }

}

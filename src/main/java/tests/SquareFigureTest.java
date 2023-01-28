package tests;

import model.SquareFigure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.awt.*;


class SquareFigureTest {
    public final int[] X = new int[] { 50, 50, 250, 250 };
    public int[] Y = new  int[] {50, 250, 250, 50};
    private final SquareFigure squareFigure = new SquareFigure(X, Y);
    @Test
    void getXCoordinates() {
        Assertions.assertArrayEquals(X, squareFigure.getXCoordinates());
    }

    @Test
    void getYCoordinates() {
        Assertions.assertArrayEquals(X, squareFigure.getXCoordinates());
    }

    @Test
    void getColor() {
        Color color = new Color(100, 45, 245, 45 );
        Assertions.assertEquals(color, squareFigure.getColor());
    }

    @Test
    void getArea() {
        Assertions.assertEquals(40000, squareFigure.getArea());
    }

    @Test
    void getPerimeter() {
        Assertions.assertEquals(800, squareFigure.getPerimeter());
    }
}
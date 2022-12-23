package model;

import org.junit.jupiter.api.*;
import java.awt.*;

public class RectangleTest {
    private final Rectangle rectangle = new Rectangle(10, 20, 100, 200);

    @Test
    public void testGetX() {
        Assertions.assertEquals(rectangle.getX(), 10);
    }

    @Test
    public void testGetY() {
        Assertions.assertEquals(rectangle.getY(), 20);
    }

    @Test
    public void testGetWidth() {
        Assertions.assertEquals(rectangle.getWidth(), 100);
    }

    @Test
    public void testGetHeight() {
        Assertions.assertEquals(rectangle.getHeight(), 200);
    }

    @Test
    public void testGetColor() {
        Assertions.assertEquals(rectangle.getColor(), Color.red);
    }

    @Test
    public void testGetArea() {
        float area = 100*200;
        Assertions.assertEquals(rectangle.getArea(), area);
    }

    @Test
    public void testGetPerimeter() {
        float perimeter = 2 * (100+200);
        Assertions.assertEquals(rectangle.getPerimeter(), perimeter);
    }

    @Test
    public void testGetXCoordinates() {
        int[] xs =  new int[]{10, 110, 110, 10};
        Assertions.assertArrayEquals(rectangle.getXCoordinates(), xs);
    }

    @Test
    public void testGetYCoordinates() {
        int[] ys =  new int[]{20, 20, 220, 220};
        Assertions.assertArrayEquals(rectangle.getYCoordinates(), ys);
    }

    @Test
    public void testGeneratedColorRed() {
        Rectangle rectangleWithWidthLessThan256 = new Rectangle(0, 0, 100, 200);
        Assertions.assertEquals(rectangleWithWidthLessThan256.getColor(), Color.red);
    }

    @Test
    public void testGeneratedColorGreen() {
        Rectangle rectangleWithHeightLessThan256 = new Rectangle(0, 0, 300, 200);
        Assertions.assertEquals(rectangleWithHeightLessThan256.getColor(), Color.green);
    }

    @Test
    public void testGeneratedColorBlue() {
        Rectangle rectangleWithWidthAndHeightMoreThan255 = new Rectangle(0, 0, 400, 300);
        Assertions.assertEquals(rectangleWithWidthAndHeightMoreThan255.getColor(), Color.blue);
    }

    @Test
    public void testNoArgsConstructor() {
        Rectangle rectangleWithNoArgs = new Rectangle();
        Assertions.assertEquals(rectangleWithNoArgs.getX(), 0);
        Assertions.assertEquals(rectangleWithNoArgs.getY(), 0);
        Assertions.assertEquals(rectangleWithNoArgs.getWidth(), 0);
        Assertions.assertEquals(rectangleWithNoArgs.getHeight(), 0);
    }

    @Test
    public void testEquals() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(0, 0, 0, 0, null);
        Assertions.assertEquals(r1, r2);
    }

}

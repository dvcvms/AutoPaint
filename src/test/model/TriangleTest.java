package test.model;

import model.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    private static Triangle triangle;

    @BeforeAll
    public static void createExampleObject() {
        int[] x = {6, 9, 12};
        int[] y = {17, 21, 17};
        triangle = new Triangle(x, y);
    }

    @Test
    public void getXCoordinatesTest() {
        int[] expectedX = {6, 9, 12};
        Assertions.assertArrayEquals(triangle.getXCoordinates(), expectedX);
    }

    @Test
    public void getYCoordinatesTest() {
        int[] expectedY = {17, 21, 17};
        Assertions.assertArrayEquals(triangle.getYCoordinates(), expectedY);
    }


    @Test
    public void getNumberTest() {
        int expectedNumber = 3;
        int actualNumber = triangle.getNumber();
        assertEquals(actualNumber, expectedNumber);
    }

    @Test
    public void getAreaTest() {
        float expectedArea = 12f;
        float actualArea = triangle.getArea();
        assertEquals(expectedArea, actualArea);
    }

    @Test
    public void getPerimeterTest() {
        float expectedPerimeter = 16f;
        float actualPerimeter = triangle.getPerimeter();
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    public void updateColorTest() {
        int[] shifts = {0, 1, 3, 7, 15, 31, 63, 127, 255};

        int[] x = {31, 0, 16};
        int[] y = {2, 88, 65};
        Triangle triangleColor = new Triangle(x, y);

        for (int shift : shifts) {
            int r = (x[0] * y[0] + shift) % 256;
            int g = (x[1] * y[1] + shift) % 256;
            int b = (x[2] * y[2] + shift) % 256;

            Color expectedColor = new Color(r, g, b);
            Color actualColor = triangleColor.getColor();
            triangleColor.updateColor();

            assertEquals(actualColor, expectedColor);
        }
    }
}

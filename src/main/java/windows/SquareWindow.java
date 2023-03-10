package windows;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.SquareFigure;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.FileWriter;
import java.io.IOException;


public class SquareWindow extends JFrame {
    private final int height = 300;
    private final int width = 300;
    private final int[] X = new int[] { 50, 50, 250, 250 };
    private int[] Y = new  int[] {50, 250, 250, 50};

    public SquareWindow() {
        super("Чередник Арина Квадрат");
        setSize(width, height);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        SquareFigure squareFigure = new SquareFigure(X, Y);
        Polygon square = new Polygon(squareFigure.getXCoordinates(), squareFigure.getYCoordinates(), 4);
        g2.setColor(squareFigure.getColor());
        g2.drawPolygon(square);
        g2.fill(square);

    }
}
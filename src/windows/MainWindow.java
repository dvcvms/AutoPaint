package windows;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame {

    private final int WIDTH_SIZE = 300;
    private final int HEIGHT_SIZE = 350;

    private final JButton exampleButton = new JButton("Example Button");
    private final JButton circleButton = new JButton("Efremova Yana");
    private final JButton rectangleButton = new JButton("Дмитрий Поздеев");
    private final JButton squareButton = new JButton("Чередник Арина");
    private final JButton triangleButton = new JButton("Volkov Max");

    private final Color buttonColor = new Color(135, 206, 250);

    public MainWindow() {
        super("main.Main");

        JPanel jPanel = new JPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH_SIZE, HEIGHT_SIZE);
        setResizable(false);
        setLocationRelativeTo(null);

        GridLayout layout = new GridLayout(6, 1, 5, 12);
        jPanel.add(exampleButton);
        jPanel.add(circleButton);
        jPanel.add(squareButton);
        jPanel.setLayout(layout);
        jPanel.add(rectangleButton);
        jPanel.setLayout(layout);
        getContentPane().add(jPanel);

        triangleButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
        triangleButton.setBackground(buttonColor);
        jPanel.add(triangleButton);

        getContentPane().add(jPanel);

        triangleButton.addActionListener(e -> {
            TriangleWindow triangleWindow = new TriangleWindow();
            triangleWindow.setVisible(true);
        });

        circleButton.addActionListener(e -> {
            CircleWindow circleWindow = new CircleWindow();
            circleWindow.setVisible(true);
        });

        rectangleButton.addActionListener(e -> {
            RectangleWindow rectangleWindow = new RectangleWindow();
            rectangleWindow.setVisible(true);
        });

        squareButton.addActionListener(e -> {
            SquareWindow squareWindow = new SquareWindow();
            squareWindow.setVisible(true);
        });
    }
}

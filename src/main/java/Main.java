import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import windows.MainWindow;
import model.SquareFigure;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame myWindow = new MainWindow();
        myWindow.setVisible(true);
        int[] X = new int[] { 50, 50, 250, 250 };
        int[] Y = new  int[] {50, 250, 250, 50};
        SquareFigure squareFigure = new SquareFigure(X, Y);
        serialezedSquare(squareFigure);
    }
    private static void serialezedSquare(SquareFigure squareFigure) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter("jsons/square.json");
        writer.write(gson.toJson(squareFigure));
        writer.close();
    }
}
package json;

import com.google.gson.Gson;
import model.Rectangle;

import java.awt.*;
import java.io.*;

public class RectangleJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Rectangle rectangle = new Rectangle(0, 0, 10, 10, Color.red);
        String filePath = "jsons/rectangle.json";

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            gson.toJson(rectangle, fileWriter);
        } catch (IOException e) {
            System.err.printf("Ошибка сериализации: %s\n", e.getMessage());
        }

        try (FileReader fileReader = new FileReader(filePath)) {
            Rectangle r = gson.fromJson(fileReader, Rectangle.class);
            System.out.printf("Площадь прямоугольника: %f\n", r.getArea());
        } catch (IOException e) {
            System.err.printf("Ошибка десериализации: %s\n", e.getMessage());
        }
    }
}

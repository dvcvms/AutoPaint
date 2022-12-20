import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Triangle;
import model.serializer.TriangleSerializer;

import java.io.IOException;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

import java.awt.*;

public class Main {

    private static final String FILE_PATH = "src/jsons/triangle.json";

    public static void main(String[] args) throws IOException {

        int[] x = {1, 5, 8};
        int[] y = {4, 0, 10};
        Triangle triangle = new Triangle(x, y);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Color.class, new TriangleSerializer())
                .create();

        try (FileWriter writer = new FileWriter(FILE_PATH, StandardCharsets.UTF_8)) {
            writer.write(gson.toJson(triangle));
        }

    }
}
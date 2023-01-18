package main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.CircleFigure;

import java.awt.*;
import java.io.*;


public class CircleMain {

    private static final String FILE_PATH = "src/jsons/circle.json";

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        CircleFigure circle = new CircleFigure(120, 12, 100, new Color(10, 38, 73));
        String json = objectMapper.writeValueAsString(circle);
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_PATH))) {
            out.write(json.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println(json);
    }
}


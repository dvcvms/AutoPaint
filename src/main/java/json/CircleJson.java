package json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.CircleFigure;

import java.awt.*;
import java.io.*;


public class CircleJson {
    public static void main(String[] args) throws JsonProcessingException {
        String path = "jsons/circle.json";
        ObjectMapper objectMapper = new ObjectMapper();

        CircleFigure circle = new CircleFigure(120, 12, 100, new Color(10, 38, 73));
        String json = objectMapper.writeValueAsString(circle);
        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(json.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println(json);
    }
}


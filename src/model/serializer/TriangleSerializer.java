package model.serializer;

import com.google.gson.*;

import java.awt.*;
import java.lang.reflect.Type;

public class TriangleSerializer implements JsonSerializer<Color> {

    @Override
    public JsonElement serialize(Color color, Type type, JsonSerializationContext jsonSerializationContext) {

        String hexColor;

        // Convert RGB into HEX format (#000000)
        hexColor = String.format("#%02x%02x%02x",
                color.getRed(),
                color.getGreen(),
                color.getBlue());

        return new JsonPrimitive(hexColor);
    }
}

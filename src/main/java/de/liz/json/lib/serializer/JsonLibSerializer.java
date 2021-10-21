package de.liz.json.lib.serializer;

import com.google.gson.*;
import de.liz.json.lib.JsonLib;

import java.lang.reflect.Type;

/**
 * @author kleinLisaa
 * @created 21.10.2021
 * <p>
 * Do not edit without permission.
 */
public class JsonLibSerializer implements JsonSerializer<JsonLib>, JsonDeserializer<JsonLib> {

    @Override
    public JsonLib deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return JsonLib.fromJsonElement(jsonElement);
    }

    @Override
    public JsonElement serialize(JsonLib jsonLib, Type type, JsonSerializationContext jsonSerializationContext) {
        return jsonLib.getJsonElement();
    }
}


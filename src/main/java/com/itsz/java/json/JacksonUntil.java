package com.itsz.java.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JacksonUntil {

    private final ObjectMapper mapper = new ObjectMapper();

    private JacksonUntil() {
        mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);

        mapper.registerModule(new JodaModule());
        mapper.registerModule(new GuavaModule());
    }

    public <T> T unmarshal(String json, Class<T> clazz) {
        return unmarshal(json, mapper.getTypeFactory().constructType(clazz));
    }

    public <T> T unmarshal(URL url, Class<T> clazz) {
        return unmarshal(url, mapper.getTypeFactory().constructType(clazz));
    }

    public <T> T unmarshal(URL url, JavaType type) {
        try {
            return (T) mapper.readValue(url, type);
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
    }

    public <T> T unmarshal(String json, JavaType type) {
        try {
            return (T) mapper.readValue(json, type);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException();
        }
    }

    public <T> T unmarshal(InputStream inputStream, JavaType type) {
        try {
            return mapper.readValue(inputStream, type);
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
    }

    public <E> List<E> unmarshalList(String json, Class<E> elementClazz) {
        return unmarshal(json, mapper.getTypeFactory().constructParametrizedType(List.class, List.class, elementClazz));
    }

    public <E> Set<E> unmarshalSet(String json, Class<E> elementClazz) {
        return unmarshal(json, mapper.getTypeFactory().constructParametrizedType(Set.class, Set.class, elementClazz));
    }

    public <V> Map<String, V> unmarshalMap(String json, Class<V> valueClazz) {
        return unmarshal(json, mapper.getTypeFactory().constructParametrizedType(Map.class, Map.class, String.class, valueClazz));
    }

    public String marshal(Object data) {
        try {
           return mapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException();
        }
    }


}

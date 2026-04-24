package br.com.eduardofbom.contador.infrastructure.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConvertData implements IConvertData {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T readData(String json, Class<T> tClass) {
        try {
            return mapper.readValue(json, tClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public <T> T readData(File file, Class<T> tClass) {
        try {
            return mapper.readValue(file, tClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeData(File file, Object tClass) {
        try {
            mapper.writeValue(file, tClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

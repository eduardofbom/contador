package br.com.eduardofbom.contador.infrastructure.model;

import java.io.File;

public interface IConvertData {
    <T> T readData(String json, Class<T> tClass);
    <T> T readData(File file, Class<T> tClass);
}

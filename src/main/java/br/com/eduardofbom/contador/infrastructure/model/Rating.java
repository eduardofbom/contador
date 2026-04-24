package br.com.eduardofbom.contador.infrastructure.model;

public record Rating<T> (Class<T> tClass, double grade, String commentary) {
}

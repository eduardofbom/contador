package br.com.eduardofbom.contador.infrastructure.model;

public record Task(String description,
                   boolean completed,
                   String responsiblePerson) {
}

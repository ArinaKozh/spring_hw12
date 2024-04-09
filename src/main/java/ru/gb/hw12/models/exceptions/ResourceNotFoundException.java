package ru.gb.hw12.models.exceptions;

/**
 * Исключение при отсутствии данных в БД.
 */
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

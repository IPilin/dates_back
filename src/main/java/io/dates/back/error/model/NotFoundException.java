package io.dates.back.error.model;


public class NotFoundException extends RuntimeException {
    public NotFoundException(final String message) {
        super(message);
    }
}

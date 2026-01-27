package org.example.test_spring.services.exceptions;

public class ResourceNotFoundExeception extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundExeception(Object id) {
        super("Resource " + id + " not found");
    }
}

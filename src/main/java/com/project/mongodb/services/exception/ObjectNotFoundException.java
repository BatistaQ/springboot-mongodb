package com.project.mongodb.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String msg){
        super(msg);
    }
}

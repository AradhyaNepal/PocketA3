package com.a2.pocketA3.constants;

import org.springframework.http.HttpStatus;


public class GenericSuccessResponse<T> extends GenericResponse<T> {
    final public T data;
    final public String message;

    public GenericSuccessResponse(T data, String message) {
        super(data, HttpStatus.OK);
        this.data = data;
        this.message = message;
    }

    public GenericSuccessResponse(String message) {
        super(null,HttpStatus.OK);
        this.data = null;
        this.message = message;
    }
}
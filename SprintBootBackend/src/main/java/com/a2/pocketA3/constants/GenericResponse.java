package com.a2.pocketA3.constants;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

abstract public class GenericResponse<T> extends ResponseEntity<T> {
    public GenericResponse(T data, HttpStatusCode status) {
        super(data, status);
    }
}





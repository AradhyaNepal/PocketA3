package com.a2.pocketA3.constants;


import org.springframework.http.HttpStatusCode;


public class GenericErrorResponse extends GenericResponse<String> {
    final public String error;

    public GenericErrorResponse(String error, HttpStatusCode status) {
        super(error, status);
        this.error = error;
    }
}

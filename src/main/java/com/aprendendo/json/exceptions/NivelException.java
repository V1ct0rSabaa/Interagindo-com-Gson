package com.aprendendo.json.exceptions;

public class NivelException extends RuntimeException{
    public NivelException(){};
    public NivelException(String errorMessage){
        super(errorMessage);
    }
}

package com.diogocapela.pl14.exceptions;

public class DiaInvalidoException extends Exception {

    public DiaInvalidoException() {
        super();

    }
    public DiaInvalidoException(String message) {
        super(message);
    }

    public DiaInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DiaInvalidoException(Throwable cause) {
        super(cause);
    }

}

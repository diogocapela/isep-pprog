package com.diogocapela.pl14.exceptions;

public class AnoInvalidoException extends Exception {

    public AnoInvalidoException() {
        super();

    }
    public AnoInvalidoException(String message) {
        super(message);
    }

    public AnoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnoInvalidoException(Throwable cause) {
        super(cause);
    }

}

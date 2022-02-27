package com.diogocapela.pl14.exceptions;

public class MesInvalidoException extends Exception {

    public MesInvalidoException() {
        super();

    }
    public MesInvalidoException(String message) {
        super(message);
    }

    public MesInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public MesInvalidoException(Throwable cause) {
        super(cause);
    }

}

package br.com.catalisa.stockz.exception;

public class EmailDuplicadoException extends RuntimeException{
    public EmailDuplicadoException(String message) {
        super(message);
    }
}

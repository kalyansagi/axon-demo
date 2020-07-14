package com.example.axomdemo.api.exceptions;

public class UnconfirmedOrderException extends IllegalStateException {
    public UnconfirmedOrderException() {
        super("Shipping an order is not possible without having confirmed.");
    }
}

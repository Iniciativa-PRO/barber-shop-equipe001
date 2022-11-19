package com.iniciativapro.barbershop.exceptions;

public class NoAuthorized extends Exception {
    @Override
    public String toString() {
        return "Usuario não autorizado";
    }
}

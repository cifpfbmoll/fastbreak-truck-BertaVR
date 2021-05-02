package edu.pingpong.domain;

import edu.pingpong.types.Juguete;

public class Plumbus extends Juguete {

    private final String NOMBRE = "plumbus";
    private final Float PVP = 100f;

    public Plumbus() {

    }

    public String nombre() {
        return NOMBRE;
    }

    public Float pvp() {
        return PVP;
    }
}

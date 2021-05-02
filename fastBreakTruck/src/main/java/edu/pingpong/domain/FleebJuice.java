package edu.pingpong.domain;

import edu.pingpong.types.Bebida;

public class FleebJuice extends Bebida {

    private final String NOMBRE = "Fleeb juice";
    private final Float PVP = 35f;

    public FleebJuice() {

    }

    public String nombre() {
        return NOMBRE;
    }

    public Float pvp() {
        return PVP;
    }
}

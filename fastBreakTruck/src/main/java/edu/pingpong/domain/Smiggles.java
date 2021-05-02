package edu.pingpong.domain;

import edu.pingpong.types.Cereales;

public class Smiggles extends Cereales {
    private final String NOMBRE = "Smiggles";
    private final Float PVP = 50f;

    public Smiggles() {

    }

    @Override
    public String nombre() {
        return NOMBRE;
    }
    @Override
    public Float pvp() {
        return PVP;
    }
}

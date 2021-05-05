package edu.pingpong.domain;

import edu.pingpong.types.Bebida;

public class TurbulentJuice extends Bebida {

    private final String NOMBRE = "Turbulent juuuuuice";
    private final Float PVP = 30f;

    public TurbulentJuice() {

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
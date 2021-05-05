package edu.pingpong.domain;

import edu.pingpong.behaviour.Packing;

public class Caja implements Packing {

    public Caja() {
    }
    @Override
    public String envoltorio() {
        return "caja";
    }
}

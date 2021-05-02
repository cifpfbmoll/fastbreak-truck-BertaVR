package edu.pingpong.domain;

import edu.pingpong.behaviour.Packing;

public class Tubo implements Packing {

    public Tubo() {
    }
    @Override
    public String envoltorio() {
        return "tubo";
    }
}

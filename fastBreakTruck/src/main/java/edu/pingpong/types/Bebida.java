package edu.pingpong.types;

import edu.pingpong.behaviour.Item;
import edu.pingpong.behaviour.Packing;
import edu.pingpong.domain.Tubo;

public abstract class Bebida implements Item {

    public Bebida() {
    }

    public Packing empaquetado() {
        return new Tubo();
    }

    @Override
    public String toString() {
        return "Item: " + nombre() + ", Empaquetado: Tubo"  + ", Precio: " + pvp().toString() + '\n';
    }

}

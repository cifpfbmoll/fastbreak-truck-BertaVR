package edu.pingpong.types;

import edu.pingpong.behaviour.Item;
import edu.pingpong.behaviour.Packing;
import edu.pingpong.domain.Caja;


public abstract class Cereales implements Item {
    public Cereales() {
    }

    public Packing empaquetado() {
        return new Caja();
    }

    @Override
    public String toString() {
        return "Item: " + nombre() + ", Empaquetado: " + empaquetado().toString() + ", Precio: " + pvp().toString();
    }
}

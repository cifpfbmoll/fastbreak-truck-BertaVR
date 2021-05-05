package edu.pingpong.behaviour;

import java.util.Formatter;

public interface Item {
    String nombre();

    Packing empaquetado();

    Float pvp();

    default String formatoOutput(){
        StringBuilder item = new StringBuilder();
        Formatter formatoItem = new Formatter(item);

        formatoItem.format("Item: %1$s, Empaquetado: %2$s, Precio: %3$s \n",
                            this.nombre(), this.empaquetado().envoltorio(), this.pvp());

        formatoItem.close();

        return item.toString();

    }
}

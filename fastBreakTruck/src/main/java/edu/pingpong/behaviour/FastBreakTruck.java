package edu.pingpong.behaviour;

import edu.pingpong.domain.*;

public class FastBreakTruck {
    public FastBreakTruck() {
    }

    public static Desayuno prepararEyeHoles() {
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Eyeholes());
        desayuno.addItem(new TurbulentJuice());
        return desayuno;
    }

    public static Desayuno prepararSmiggles() {
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Smiggles());
        desayuno.addItem(new FleebJuice());
        return desayuno;
    }

    public static boolean incluirJuguete(Desayuno desayuno) {//por programación defensiva checkeo que sea un eyeholes
        boolean jugueteIncluido = false;
        for (Item item : desayuno.getItems()) {
            if (item instanceof Eyeholes) {
                desayuno.addItem(new Plumbus());
                jugueteIncluido = true;
                break;
            }

        }

    return jugueteIncluido;
    }

}

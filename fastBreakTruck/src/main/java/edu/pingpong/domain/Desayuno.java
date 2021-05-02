package edu.pingpong.domain;

import edu.pingpong.behaviour.Item;

import java.util.ArrayList;
import java.util.List;

public class Desayuno {
    private Float total = 0f;


    private final List<Item> items = new ArrayList<Item>();

    public Desayuno() {

    }

    public List<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        getItems().add(item);
    }

    public void mostrarItems() {
        for (Item item : this.getItems()) {
            System.out.print(item.toString());
        }
    }

    public Float getCoste() {
        total = 0f; //lo pongo en 0 antes porque si no da problemas cuando checkeas el precio 2 veces
        getItems().forEach(item -> total += item.pvp());
        return this.total;
    }


}

package org.zoo.fish;

import org.zoo.EarthCreatures;

public class Fishes extends EarthCreatures {

    public Fishes () {
        this.category = "fishes";
    }

    protected void breathe() {
        System.out.print("get oxygen from the water");
    }

    public void move() {
        System.out.print("swim in the water");
    }

}

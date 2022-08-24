package org.zoo;

public class Fishes extends EarthCreatures {

    public Fishes () {
        this.category = "fishes";
    }

    protected void breathe() {
        System.out.print("get oxygen from the water");
    }

    protected void move() {
        System.out.print("swim in the water");
    }

}

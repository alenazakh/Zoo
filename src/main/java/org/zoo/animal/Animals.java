package org.zoo;
public abstract class Animals extends EarthCreatures {

    public Animals () {
        this.category = "animal";
    }

    public void breathe() {
        System.out.print("breathe the air");
    }

    protected void move() {
        System.out.print("walk on the earth");
    }

}

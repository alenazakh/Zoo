package org.zoo.animal;

import org.zoo.EarthCreatures;

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

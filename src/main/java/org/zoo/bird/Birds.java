package org.zoo.bird;

import org.zoo.EarthCreatures;

public class Birds extends EarthCreatures {

    public Birds () {
        this.category = "birds";
    }

    protected void breathe() {
        System.out.print("breathe the air");
    }

    protected void move() {
        System.out.print("fly in the sky");
    }

}

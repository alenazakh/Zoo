package org.zoo;

public abstract class  EarthCreatures {

    String category;

    public EarthCreatures() {
        this.category = "Earth creature";
    }

    protected void breathe() {
        System.out.println("how I breathe");
    };

    protected void move() {
        System.out.println("how I move");
    };

    protected void printInfo () {
        System.out.println("---------------------");
        System.out.printf("Like common %s I ", category);
        breathe();
        System.out.print(" and ");
        move();
        System.out.print(".\n");
    };

}

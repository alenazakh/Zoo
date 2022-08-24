package org.zoo;

public abstract class  EarthCreatures {

    public String category;

    public EarthCreatures() {
        this.category = "Earth creature";
    }

    protected abstract void breathe();

    protected abstract void move();

    protected void printInfo () {
        System.out.println("---------------------");
        System.out.printf("Like common %s I ", category);
        breathe();
        System.out.print(" and ");
        move();
        System.out.print(".\n");
    };

}

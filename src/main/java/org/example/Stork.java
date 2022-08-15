package org.example;

public class Stork extends Birds {
    public Stork () {
        this.category = "Stork";
    }

    private void symbol () {
        System.out.println("I'm one of the national symbols of Belarus.");
    }

    public void printInfo () {
        super.printInfo();
        symbol();
    }
}

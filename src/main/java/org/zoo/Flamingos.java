package org.example;

public class Flamingos extends Birds{

    public Flamingos () {
        this.category = "Flamingo";
    }

    private void beauty () {
        System.out.println("I'm one of the most beautiful bird in the world.");
    }

    public void printInfo () {
        super.printInfo();
        beauty();
    }
}

package org.zoo.fish;

public class Sturgeon extends Fishes {

    public Sturgeon () {
        this.category = "Sturgeon";
    }

    private void production () {
        System.out.println("I produce quite expensive treats for people - black caviar.");
    }

    public void printInfo () {
        super.printInfo();
        production();
    }

}

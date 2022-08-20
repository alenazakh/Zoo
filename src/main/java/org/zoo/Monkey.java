package org.example;

public class Monkey extends Animals {


    public Monkey () {
        this.category = "Monkey";
    }

    private void perspective () {
        System.out.println("When i'll be working hard i can become a human. Darvin said so.");
    }

    public void printInfo () {
        super.printInfo();
        perspective();
    }

}

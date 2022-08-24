package org.zoo;

public class Whale extends Animals {

    public Whale () {
        this.category = "Whale";
    }

    private void uniqueness () {
        System.out.println("Whales are the largest creatures that have ever lived on earth.");
    }

    public void printInfo () {
        System.out.println("---------------------");
        System.out.print("I'm not common creature. I'm an animal which ");
        breathe();
        System.out.print(" and ");
        Fishes anyFish = new Fishes();
        anyFish.move();
        System.out.print(".\n");
        uniqueness ();
    }

}

package org.zoo;

public class GoldFish extends Fishes {

    public GoldFish () {
        this.category = "GoldFish";
    }

    private void makeMiracle () {
        System.out.println("I can make your dreams true!!!");
    }

    public void printInfo () {
        super.printInfo();
        makeMiracle();
    }

}

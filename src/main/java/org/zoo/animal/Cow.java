package org.zoo.animal;

public class Cow extends Animals {

    public Cow () {
        this.category = "Cow";
    }

    private void destiny () {
        System.out.println("Only indian people like, others like me eating ((.");
    }

    public void printInfo () {
        super.printInfo();
        destiny();
    }

}

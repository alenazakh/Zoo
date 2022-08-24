package org.zoo;
public class Dog extends Animals {

    public Dog () {
        this.category = "Dog";
    }

    private void mission () {
        System.out.println("Someone say that I'm the best humans friend.");
    }


    public void printInfo () {
        super.printInfo();
        mission();
    }

}

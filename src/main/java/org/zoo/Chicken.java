package org.example;

public class Chicken extends Birds {

    public Chicken () {
        this.category = "Chicken";
    }

    private void philosophy () {
        System.out.println("What came first the egg or the chicken. That is the question.");
    }

    public void printInfo () {
        super.printInfo();
        System.out.println("It is not exactly true. But..");
        philosophy();
    }

}

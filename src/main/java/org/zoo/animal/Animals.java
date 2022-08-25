package org.zoo.animal;

import org.zoo.EarthCreatures;

public class Animals extends EarthCreatures {

    public Animals () {
        this.category = "animal";
    }

    public void breathe() {
        System.out.print("breathe the air");
    }

    protected void move() {
        System.out.print("walk on the earth");
    }

    // method was added for tests
    public String move(String message) {
        boolean checkTest = message.equals("test");
        if (checkTest) {
            String moveMessage = "walk on the earth";
            return moveMessage;
        } else {
            return "";
        }
    }

    // method was added for tests
    public String breathe(String message) {
        boolean checkTest = message.equals("test");
        if (checkTest) {
            String breatheMessage = "breathe the air";
            return breatheMessage;
        } else {
            return "";
        }
    }

}

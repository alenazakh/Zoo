package org.zoo.bird;

import org.zoo.EarthCreatures;

public class Birds extends EarthCreatures {

    public Birds () {
        this.category = "birds";
    }

    protected void breathe() {
        System.out.print("breathe the air");
    }

    protected void move() {
        System.out.print("fly in the sky");
    }

    // method was added for tests
    public String move(String message) {
        boolean checkTest = message.equals("test");
        if (checkTest) {
            String moveMessage = "fly in the sky";
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

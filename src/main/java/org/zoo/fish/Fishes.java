package org.zoo.fish;

import org.zoo.EarthCreatures;

public class Fishes extends EarthCreatures {

    public Fishes () {
        this.category = "fishes";
    }

    protected void breathe() {
        System.out.print("get oxygen from the water");
    }

    public void move() {
        System.out.print("swim in the water");
    }

    public String move(String message) {
        boolean checkTest = message.equals("test");
        if (checkTest) {
            String moveMessage = "swim in the water";
            return moveMessage;
        } else {
            return "";
        }
    }

    // method was added for tests
    public String breathe(String message) {
        boolean checkTest = message.equals("test");
        if (checkTest) {
            String breatheMessage = "get oxygen from the water";
            return breatheMessage;
        } else {
            return "";
        }
    }


}

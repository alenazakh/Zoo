package org.zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<EarthCreatures> allCreatures = makeListOfCreatures();
        Scanner scanner = new Scanner(System.in);
        int itemNumber = 1;
        while (itemNumber != 0) {
            int count = 1;
            System.out.println("\nMenu:");
            for (EarthCreatures item : allCreatures) {
                System.out.printf("%d - %s.\n", count, item.category);
                count++;
            }
            System.out.println("0 - Exit.");
            System.out.println("Enter menu item: ");
            itemNumber = scanner.nextInt();
            scanner.nextLine();
            if (itemNumber != 0) {
                EarthCreatures currentCreature = allCreatures.get(itemNumber-1);
                currentCreature.printInfo();
            } else {
                break;
            }
        }
        System.out.println("Bye.. Bye..");
    }

    private static ArrayList<EarthCreatures> makeListOfCreatures () {
        ArrayList<EarthCreatures> listOfCreatures = new ArrayList<>();
        Monkey creatureMonkey =  new Monkey();
        listOfCreatures.add(creatureMonkey);
        Stork creatureStork = new Stork();
        listOfCreatures.add(creatureStork);
        Whale creatureWhale = new Whale();
        listOfCreatures.add(creatureWhale);
        Dog creatureDog = new Dog();
        listOfCreatures.add(creatureDog);
        Flamingos creatureFlamingo = new Flamingos();
        listOfCreatures.add(creatureFlamingo);
        Sturgeon creatureSturgeon = new Sturgeon();
        listOfCreatures.add(creatureSturgeon);
        Cow creatureCow = new Cow();
        listOfCreatures.add(creatureCow);
        Chicken creatureChicken = new Chicken();
        listOfCreatures.add(creatureChicken);
        GoldFish creatureGoldFish = new GoldFish();
        listOfCreatures.add(creatureGoldFish);
        return listOfCreatures;
    }

}
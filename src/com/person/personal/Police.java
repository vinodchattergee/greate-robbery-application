package com.person.personal;

import java.util.Random;

public class Police {
    private Detective detective;
    private Random random;

    public Police() {
        Item[] items = new Item[1];
        Item gun = new Item("Gun", 20.0);
        items[0] = gun;

        Detective adamPalmer = new Detective("Adam Palmer", "Coyote", 1983, "Encounter Specialist", items);

        this.detective = adamPalmer;
    }

    private boolean areCriminalsCaught() {
        random = new Random();
        int randomNumber = random.nextInt(101);
        if (Detective.SUCCESS_PERCENTAGE <= randomNumber)
            return false;
        return true;
    }

    public boolean catchCriminals(Gang gang) {
        if (areCriminalsCaught()) {
            System.out.println("detective’s name " + detective.getName() + " managed to catch the gang.");
            if (gang.getSumRobbedValue() > 0) {
                System.out.println("The solen items are recovered.");
                System.out.println("Their overall value is estimated to $" + gang.getSumRobbedValue());
            } else {
                System.out.println("The gang couldn’t steal anything.");
            }
            return true;
        } else {
            System.out.println(detective.getName() + " couldn't catch the gang.");
            System.out.println("They managed to steal items valued $ " + gang.getSumRobbedValue());
        }
        return false;
    }
}

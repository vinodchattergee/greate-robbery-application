package com.person.personal;

import java.util.Random;

public class Gang {
    private Criminal[] criminals;
    private Random random;
    private double sumRobbedValue;

    public Gang() {
        criminals = new Criminal[2];

        Item[] robItems = new Item[1];
        robItems[0]  = new Item("bosch tool kit", 45.9);
        criminals[0] = new Criminal("Robby", "The Head", 1974, "Bank Robbery", robItems);

        Item[] bobItems = new Item[1];
        bobItems[0] = new Item("ibex tool kit", 35.5);
        criminals[1] = new Criminal("Bobby", "The Mountain", 1978, "Jewel Robbery", bobItems);
    }

    public double getSumRobbedValue() {
        return sumRobbedValue;
    }

    public void getGangInfo() {
        for (Criminal criminal : criminals) {
            System.out.println("----------------------------");
            criminal.printBiodata();
        }
    }

    private boolean isSuccessfulRobbery() {
        random = new Random();
        int randomNumber = random.nextInt(101);
        int numberOfCriminals = criminals.length;
        if (Criminal.SUCCESS_PERCENTAGE * numberOfCriminals > randomNumber)
            return true;
        return false;
    }

    public void letRob(Building[] buildings) {
        random = new Random();
        int randomNumber = random.nextInt(buildings.length);
        System.out.println("------------------------------");
        if (isSuccessfulRobbery()) {
            System.out.println("The gang managed to rob the following items from the " + buildings[randomNumber].getName() + ".");
            for (Item item : buildings[randomNumber].getItems()) {
                System.out.println("Robbed item : " + item.getName() + " of worth : " + item.getValue());
                sumRobbedValue += item.getValue();
            }
            System.out.println("The gang managed to rob worth of value " + getSumRobbedValue());
        } else {
            System.out.println("The gang tried to rob the " + buildings[randomNumber].getName() + " but they failed");
        }
    }
}

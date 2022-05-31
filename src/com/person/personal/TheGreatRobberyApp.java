package com.person.personal;

public class TheGreatRobberyApp {
    public static void main(String[] args) {
        City city = new City();
        Gang gang = new Gang();
        Police police = new Police();

        gang.getGangInfo();
        do {
            gang.letRob(city.getBuildings());
        } while (!police.catchCriminals(gang));
    }
}

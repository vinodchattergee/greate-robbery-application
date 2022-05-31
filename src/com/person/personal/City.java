package com.person.personal;

public class City {
    private Building[] buildings = new Building[4];

    public City() {
        Item[] bankItems = new Item[2];
        bankItems[0] = new Item("Letter Opener", 1.5);
        bankItems[1] = new Item("Stamp", 2.5);
        buildings[0] = new Building("Bank", bankItems);

        Item[] mansionItems = new Item[2];
        mansionItems[0] = new Item("Price of Shoes", 25);
        mansionItems[1] = new Item("Broken Glass", 0.1);
        buildings[1] = new Building("Mansion", mansionItems);

        Item[] poItems = new Item[2];
        poItems[0] = new Item("Letter to Gautham", 1.5);
        poItems[1] = new Item("Pencil", 2.0);
        buildings[2] = new Building("Post Office", poItems);

        Item[] superMarketItems = new Item[2];
        superMarketItems[0] = new Item("A loaf of bread", 2.5);
        superMarketItems[1] = new Item("A bag of tea", 6.5);
        buildings[3] = new Building("Super Market", superMarketItems);
    }

    public Building[] getBuildings() {
        return buildings;
    }
}

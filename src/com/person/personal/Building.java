package com.person.personal;

public class Building {
    private String name;
    private Item[] items;

    public String getName() {
        return name;
    }

    public Item[] getItems() {
        return items;
    }

    public Building(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }
}

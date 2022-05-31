package com.person.personal;

public class Item {
    private String name;
    private double value;

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }
}

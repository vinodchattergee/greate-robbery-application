package com.person.personal;

public abstract class Person {
    private String name;
    private String nickName;
    private int yearOfBorn;
    private String expertIn;
    private Item[] items;

    public Person(String name, String nickName, int yearOfBorn, String expertIn, Item[] items) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.expertIn = expertIn;
        this.items = items;
    }

    public void printBiodata() {
        System.out.println("Name of the Person : " + name);
        System.out.println("Nick name of the Person : " + nickName);
        System.out.println("Year of born : " + yearOfBorn);
        System.out.println("The area of expertise : " + expertIn);
        for (Item item : items) {
            System.out.println("Items he got " + item.getName() + " of worth $" + item.getValue());
        }
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }
}

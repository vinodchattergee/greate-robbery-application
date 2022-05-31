package com.person.personal;

public class Criminal extends Person {


    public static final int SUCCESS_PERCENTAGE = 20;

    public Criminal(String name, String nickName, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickName, yearOfBorn, expertIn, items);
    }

    @Override
    public void printBiodata() {
        System.out.println("Criminal Person : ");
        super.printBiodata();
    }
}

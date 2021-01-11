package com.codecool.interfaceWS;

public class Bird implements Flying, Feeding, Speaking{
    private String name;
    private boolean isFemale;

    public Bird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

//    @Override
//    public void fly() {
//        System.out.println("Csajp-Csajp");
//    }
//
//    public void feed() {
//        System.out.println("What a wonderful worm");
//    }

    @Override
    public void fly() {
        speak("Csajp-Csajp");
    }

    @Override
    public void feed() {
        speak("What a wonderful worm");
    }

//    OAW:
//    @Override
//    public void speak(String str) {
//        System.out.println(str);
//    }
}

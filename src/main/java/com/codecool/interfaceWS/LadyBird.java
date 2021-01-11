package com.codecool.interfaceWS;

public class LadyBird implements Flying, Feeding, Speaking {
    private String name;
    private boolean isFemale;

    public LadyBird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

//    @Override
//    public void fly() {
//        System.out.println("Buzz-Buzz");
//    }
//
//    public void feed() {
//        System.out.println("I love aphid");
//    }

    @Override
    public void fly() {
        speak("Buzz-Buzz");
    }

    @Override
    public void feed() {
        speak("I love aphid");
    }

//    OAW:
//    public void speak(String str) {
//        System.out.println(str);
//    }
}

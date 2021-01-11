package com.codecool.interfaceWS;

public interface Speaking {
//    public void speak(String str);

//    OAW:
    public default void speak(String str) {
        System.out.println(str);
    }
}

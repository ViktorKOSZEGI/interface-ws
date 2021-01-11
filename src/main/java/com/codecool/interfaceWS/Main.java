package com.codecool.interfaceWS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        OAW:
//        Bird myBird1 = new Bird("AAA", true);
//        Bird myBird2 = new Bird("BBB", false);
//        LadyBird myLadyBird1 = new LadyBird("XXX", true);
//        LadyBird myLadyBird2 = new LadyBird("YYY", false);
//        myBird1.fly();
//        myBird2.fly();
//        myLadyBird1.fly();
//        myLadyBird2.fly();
//        myBird1.feed();
//        myBird2.feed();
//        myLadyBird1.feed();
//        myLadyBird2.feed();

//        OAW:
        List<Flying> animals1 = new ArrayList<>(Arrays.asList(
                new Bird("AAA", true),
                new Bird("BBB", false),
                new LadyBird("XXX", true),
                new LadyBird("YYY", false)
        ));
        for (Flying animal : animals1) {
            animal.fly();
        }
        List<Feeding> animals2 = new ArrayList<>(Arrays.asList(
                new Bird("AAA", true),
                new Bird("BBB", false),
                new LadyBird("XXX", true),
                new LadyBird("YYY", false)
        ));
        for (Feeding animal : animals2) {
            animal.feed();
        }

//        OAW:
//        List<Object> animals = new ArrayList<>(Arrays.asList(
//                new Bird("AAA", true),
//                new Bird("BBB", false),
//                new LadyBird("XXX", true),
//                new LadyBird("YYY", false)
//        ));
//        for (Object animal : animals) {
//            if (animal instanceof Flying) {
//                ((Flying)animal).fly();
//            }
//            if (animal instanceof Feeding) {
//                ((Feeding)animal).feed();
//            }
//        }

    }
}

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
        List<Flying> flyingAnimals = new ArrayList<>(Arrays.asList(
                new Bird("AAA", true),
                new Bird("BBB", false),
                new LadyBird("XXX", true),
                new LadyBird("YYY", false)
        ));
        for (Flying animal : flyingAnimals) {
            animal.fly();
        }
        List<Feeding> feedingAnimals = new ArrayList<>(Arrays.asList(
                new Bird("AAA", true),
                new Bird("BBB", false),
                new LadyBird("XXX", true),
                new LadyBird("YYY", false)
        ));
        for (Feeding animal : feedingAnimals) {
            animal.feed();
        }

//        OAW:
//        List<Object> objectAnimals = new ArrayList<>(Arrays.asList(
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

        //create and fill non-generic ArrayList in one line:
        List myNonGenAL = new ArrayList(Arrays.asList(
                new Bird("AAA", true),
                new Bird("BBB", false),
                new Bird("CCC", false),
                new LadyBird("XXX", true),
                new LadyBird("YYY", false),
                new LadyBird("ZZZ", false)
        ));
//        oaw:
//        List myNonGenAL = List.of(
//                new Bird("AAA", true),
//                new Bird("BBB", false),
//                new Bird("CCC", false),
//                new LadyBird("XXX", true),
//                new LadyBird("YYY", false),
//                new LadyBird("ZZZ", false)
//        );

        //sab. with generic ArrayList with <Speaking type> interface:
        List<Speaking> speakingAnimals = new ArrayList<>(Arrays.asList(
                new Bird("AAA", true),
                new Bird("BBB", false),
                new Bird("CCC", false),
                new LadyBird("XXX", true),
                new LadyBird("YYY", false),
                new LadyBird("ZZZ", false)
        ));

        UncleBen myUncleBen = new UncleBen();
        myUncleBen.feedBirds(myNonGenAL);

        WildAnimalList<Wolf> wolfs = new WildAnimalList<>();
        Wolf myWolf = new Wolf();
        wolfs.add(myWolf);
    }
}

package com.codecool.interfaceWS;

import java.util.ArrayList;
import java.util.List;

//public class WildAnimalList<E extends WildAnimal> {
//    List<E> wildAnimals = new ArrayList<>();
//
//    public void add(E myE) {
//        wildAnimals.add(myE);
//    }
//}

//oaw:
public class WildAnimalList<WildAnimal> {
    List<WildAnimal> wildAnimals = new ArrayList<>();

    public void add(WildAnimal myWildAnimal) {
        wildAnimals.add(myWildAnimal);
    }
}

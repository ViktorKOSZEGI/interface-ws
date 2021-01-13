package com.codecool.interfaceWS;

import java.util.List;

public class UncleBen {

//    //method with non-generic List in input param
//    public void feedBirds (List birds) {
//        for (Object bird : birds) {
//            if (bird instanceof Bird) {
//                ((Bird)bird).feed();
//            }
//        }
//    }
//
//    //method with generic List<Flying interface type> input param
//    public void feedBirds (List<Flying> birds) {
//        for (Flying bird : birds) {
//            if (bird instanceof Bird) {
//                ((Bird)bird).feed();
//            }
//        }
//    }
//
//    //method with generic List<Object class type> input param
//    public void feedBirds (List<Object> birds) {
//        for (Object bird : birds) {
//            if (bird instanceof Bird) {
//                ((Bird)bird).feed();
//            }
//        }
//    }

    //method with generic List<Bird class type> input param
    public void feedBirds (List<Bird> birds) {
        for (Bird bird : birds) {
            bird.feed();
        }
    }
}

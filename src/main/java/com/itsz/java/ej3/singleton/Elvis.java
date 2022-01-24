package com.itsz.java.ej3.singleton;

import java.io.Serializable;

public class Elvis implements Serializable {

    private static final Elvis instance = new Elvis();

    private Elvis () {};

    public static Elvis getInstance() {
        return instance;
    }

    public void leaveBuilding(){

    }

//    private Object readResolve() {
//        // Return the one true Elvis and let the garbage collector
//        // take care of the Elvis impersonator.
//        return instance;
//    }



}

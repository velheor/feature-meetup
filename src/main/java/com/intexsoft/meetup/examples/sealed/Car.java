package com.intexsoft.meetup.examples.sealed;

public abstract sealed class Car permits Audi, SEAT, Skoda, Volkswagen {
    
    void processCar(Car car) {
//        if (car instanceof BMW) {
//            
//        }
    }
}


package com.intexsoft.meetup.examples.pattern;

public class AnimalSwitchExample {
    public static void main(String[] args) {
        Animals animal = Animals.LION; // Example animal
        handleAnimal(animal);
    }
    public static void handleAnimal(Animals animal) {
        switch (animal) {
            case LION -> System.out.println("Roaring!");
            case TIGER -> System.out.println("Growling!");
            case ELEPHANT -> System.out.println("Trumpeting!");
            case GIRAFFE -> System.out.println("Snorting!");
            default -> System.out.println("Unknown animal sound!");
        }
    }
}

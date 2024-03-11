package com.intexsoft.meetup.examples.sealed;

public sealed class Audi extends Car implements CarInterface {
    public static final class A3 extends Audi {}
    public static final class A4 extends Audi {}
    public static final class A5 extends Audi {}
}

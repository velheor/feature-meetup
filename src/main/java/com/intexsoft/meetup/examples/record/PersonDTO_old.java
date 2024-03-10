package com.intexsoft.meetup.examples.record;

import java.util.Objects;

public class PersonDTO_old {
    private final String name;
    private final int age;

    public PersonDTO_old(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO_old that = (PersonDTO_old) o;
        return age() == that.age() && Objects.equals(name(), that.name());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name(), age());
    }

    @Override
    public String toString() {
        return "PersonDTO_old[" +
                "name='" + name +
                ", age=" + age +
                ']';
    }
}

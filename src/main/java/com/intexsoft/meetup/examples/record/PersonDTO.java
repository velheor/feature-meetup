package com.intexsoft.meetup.examples.record;

import com.intexsoft.meetup.models.Person;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;

public record PersonDTO(int age, String name) {
    public PersonDTO {
        if (age < 0 || name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Person age or name is incorrect");
        }
    }


    
    public static void main(String[] args) {
        String[] args1 = {"a", "b", "c", "d", "e", "f", "r", "t", "f"};
        record PersonAndLuckScore(Person person, double luckScore) {
            void test(){
                System.out.println();
            }
        }
        PersonAndLuckScore personAndLuckScore = new PersonAndLuckScore(new Person(), 10);
        
        List<Person> persons = new ArrayList<>();
        persons.stream()
                .map(p -> new PersonAndLuckScore(p, calculateSuccessScore(p)))
                .sorted(comparing(PersonAndLuckScore::luckScore, reverseOrder()))
                .map(PersonAndLuckScore::person)
                .limit(10)
                .toList();
    }

    public static void test(String[] args) {
        
    }

    
    private static double calculateSuccessScore(Person p) {
        return 0;
    }
}

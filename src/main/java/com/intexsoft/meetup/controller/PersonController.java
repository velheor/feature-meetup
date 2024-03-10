package com.intexsoft.meetup.controller;

import com.intexsoft.meetup.models.Person;
import com.intexsoft.meetup.serivce.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {


    private final PersonService personService;

    @GetMapping
    public List<Person> findAllByAddressAndPhone(String name, String street, String number) {
        return personService.findAllByAddressAndPhone(name, street, number);
    }
}
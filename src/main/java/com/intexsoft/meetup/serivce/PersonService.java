package com.intexsoft.meetup.serivce;

import com.intexsoft.meetup.models.Person;
import com.intexsoft.meetup.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> findAllByAddressAndPhone(String name, String street, String number) {
        return personRepository.findAllByNameAndStreetAndNumber_old(name, street, number);
    }
}

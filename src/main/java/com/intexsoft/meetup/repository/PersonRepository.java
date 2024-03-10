package com.intexsoft.meetup.repository;

import com.intexsoft.meetup.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p " +
            "JOIN FETCH p.address a " +
            "JOIN FETCH p.phones ph " +
            "WHERE p.name LIKE :name " +
            "AND a.street LIKE :street " +
            "AND ph.number LIKE :number")
    List<Person> findAllByNameAndStreetAndNumber_old(String name, String street, String number);

    @Query("""
            SELECT p FROM Person p
            JOIN FETCH p.address a
            JOIN FETCH p.phones ph
            WHERE p.name LIKE :name
            AND a.street LIKE :street
            AND ph.number LIKE :number
            """)
    List<Person> findAllByAddressAndPhone_new(String name, String street, String number);
}

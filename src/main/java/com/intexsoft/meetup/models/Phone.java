package com.intexsoft.meetup.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String number;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}


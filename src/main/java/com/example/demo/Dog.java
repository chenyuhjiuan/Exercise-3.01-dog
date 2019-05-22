package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Dog {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Size(min = 3)
    private String name;

    @Min(1)
    private int age;
}

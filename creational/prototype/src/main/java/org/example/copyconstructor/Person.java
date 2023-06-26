package org.example.copyconstructor;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private String name;
    private Address address;

    // this is the copy constructor – it DEPENDS on Address (nested object) having a copy constructor as well!
    public Person(Person other) {
        this(other.getName(), other.getAddress());
    }
}

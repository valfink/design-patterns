package org.example.copyconstructor;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Address {
    private String streetAddress;
    private String postCode;
    private String city;

    // this is the copy constructor, takes the 'other' object to be copied as argument
    public Address(Address other) {
        this(other.getStreetAddress(), other.getPostCode(), other.getCity());
    }
}

package org.example.facade;

import org.example.Person;

public class PersonAddressBuilder extends PersonBuilder {
    // constructor takes reference to Person, so we are working on the same object in the different builders!
    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder atStreetAddress(String streetAddress) {
        person.setStreetAddress(streetAddress);
        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode) {
        person.setPostcode(postcode);
        return this;
    }

    public PersonAddressBuilder inCity(String city) {
        person.setCity(city);
        return this;
    }
}

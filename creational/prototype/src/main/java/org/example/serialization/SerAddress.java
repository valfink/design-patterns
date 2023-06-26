package org.example.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

// all nested Classes must implement Serializable!
@AllArgsConstructor
@Data
public class SerAddress implements Serializable {
    private String streetAddress;
    private String postCode;
    private String city;
}

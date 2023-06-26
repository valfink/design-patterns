package org.example.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

// to work with serialization, Classes must implement Serializable Interface
@AllArgsConstructor
@Data
public class SerPerson implements Serializable {
    private String name;
    private SerAddress address;
}

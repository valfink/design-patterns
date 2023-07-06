package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Flyweight class
public class User {
    // the externalized (static) storage of actual names
    private static final List<String> namesList = new ArrayList<>();
    // the internal storage of references to the names
    private final int[] namesOfUser;

    // externalize storing the name in constructor
    public User(String fullName) {
        namesOfUser = Arrays.stream(fullName.split(" "))
                .mapToInt(name -> {
                    int index = namesList.indexOf(name);
                    if (index != -1) {
                        return index;
                    }
                    namesList.add(name);
                    return namesList.size() - 1;
                })
                .toArray();
    }

    public String getFullName() {
        return Arrays.stream(namesOfUser)
                .mapToObj(namesList::get)
                .collect(Collectors.joining(" "));
    }

    // method only for showing which names are actually in the database, not for production
    public static String printAllNames() {
        return namesList.stream().collect(Collectors.joining(", "));
    }
}

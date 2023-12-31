package org.example.multiton;

import java.util.EnumMap;
import java.util.Map;

public class SimpleMultiton {
    private static final Map<Subsystem, SimpleMultiton> INSTANCES = new EnumMap<>(Subsystem.class);

    private SimpleMultiton() {
        System.out.println("Initializing a new instance. This is instance no. " + (INSTANCES.keySet().size() + 1));
    }

    public static SimpleMultiton get(Subsystem subsystem) {
        return INSTANCES.computeIfAbsent(subsystem, k -> new SimpleMultiton());
    }
}

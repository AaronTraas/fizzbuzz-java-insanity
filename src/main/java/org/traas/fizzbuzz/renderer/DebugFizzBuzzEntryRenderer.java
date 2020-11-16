package org.traas.fizzbuzz.renderer;

import java.util.List;
import java.util.stream.Collectors;

import org.traas.fizzbuzz.domain.FizzBuzzEntry;

public class DebugFizzBuzzEntryRenderer implements IFizzBuzzEntryRenderer {

    public String render(FizzBuzzEntry entry) {
        return String.format("{ number: %d, replacements: [%s] }", 
            entry.getNumber(), 
            entry.getReplacements().stream()
                .map(obj -> String.valueOf(obj))
                .collect(Collectors.joining(", "))
        );
    }
}
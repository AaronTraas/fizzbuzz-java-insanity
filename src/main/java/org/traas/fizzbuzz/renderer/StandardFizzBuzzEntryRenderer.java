package org.traas.fizzbuzz.renderer;

import java.util.List;
import java.util.stream.Collectors;

import org.traas.fizzbuzz.domain.FizzBuzzEntry;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;

public class StandardFizzBuzzEntryRenderer implements IFizzBuzzEntryRenderer {

    public String render(FizzBuzzEntry entry) {
        return entry.getReplacements().isEmpty() ? String.valueOf(entry.getNumber()) : renderReplacements(entry.getReplacements());
    }

    private String renderReplacements(List<FizzBuzzEnum> replacements) {
        return replacements.stream()
            .map(r -> r.getReplacement())
            .collect(Collectors.joining(""));
    }
}
package org.traas.fizzbuzz.domain;

import java.util.ArrayList; 
import java.util.List; 
import java.util.stream.Collectors;

public class FizzBuzzEntry {

    private final int number;
    private final List<FizzBuzzEnum> replacements;

    public FizzBuzzEntry(int number, List<FizzBuzzEnum> replacements) {
        this.number = number;
        this.replacements = replacements;
    }

    public void addReplacement(FizzBuzzEnum replacement) {
        replacements.add(replacement);
    }

    public int getNumber() {
        return number;
    }

    public List getReplacements() {
        return replacements;
    }
}
package org.traas.fizzbuzz.observer;

import java.util.List;

public class FizzBuzzEntryMessage {

    private final List<String> entries;

    public FizzBuzzEntryMessage(List<String> entries) {
        this.entries = entries;
    }

    public List<String> getEntries() {
        return entries;
    }
}
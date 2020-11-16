package org.traas.fizzbuzz.observer;

import java.util.List;

import org.traas.fizzbuzz.domain.FizzBuzzEntry;

public class FizzBuzzEntryMessage {

    private final List<FizzBuzzEntry> entries;

    public FizzBuzzEntryMessage(List<FizzBuzzEntry> entries) {
        this.entries = entries;
    }

    public List<FizzBuzzEntry> getEntries() {
        return entries;
    }
}
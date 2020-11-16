package org.traas.fizzbuzz.observer;

import org.traas.fizzbuzz.out.IOutputDelegate;

public class FizzBuzzEntryQueueObserver {

    private final IOutputDelegate output;

    public FizzBuzzEntryQueueObserver(IOutputDelegate output) {
        this.output = output;
    }

    public void observe(FizzBuzzEntryMessage m) {
        m.getEntries().stream()
            .forEach(s -> output.out(s));
    }
}
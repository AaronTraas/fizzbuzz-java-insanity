package org.traas.fizzbuzz.observer;

import org.traas.fizzbuzz.out.OutputDelegateFactory;

public class FizzBuzzEntryQueueObserver {

    private final OutputDelegateFactory outputFactory;

    public FizzBuzzEntryQueueObserver() {
        outputFactory = new OutputDelegateFactory();
    }

    public void observe(FizzBuzzEntryMessage m) {
        m.getEntries().stream()
            .forEach(s -> outputFactory.getDelegate().out(s));
    }
}
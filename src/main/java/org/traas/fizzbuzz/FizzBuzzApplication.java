package org.traas.fizzbuzz;

import org.traas.fizzbuzz.facade.FizzBuzzFacade;
import org.traas.fizzbuzz.model.FizzBuzzTransformedEntryModel;
import org.traas.fizzbuzz.observer.FizzBuzzEntryQueueObserver;
import org.traas.fizzbuzz.out.StandardOutputDelegate;

/**
 * 
 */
public class FizzBuzzApplication {

    public static void main(String[] args) {

        final FizzBuzzTransformedEntryModel model = FizzBuzzTransformedEntryModel.getInstance();

        model.setObserver(new FizzBuzzEntryQueueObserver(new StandardOutputDelegate()));

        FizzBuzzFacade.fizzBuzzerRange(1, 100)
            .stream()
            .forEach(s -> model.addEntry(s));

        model.flushQueue();
    }
}

package org.traas.fizzbuzz;

import org.traas.fizzbuzz.facade.FizzBuzzFacade;
import org.traas.fizzbuzz.model.FizzBuzzEntryModel;
import org.traas.fizzbuzz.observer.FizzBuzzEntryQueueObserver;

/**
 * 
 */
public class FizzBuzzApplication {

    private final FizzBuzzEntryModel model;

    public FizzBuzzApplication() {
        model = FizzBuzzEntryModel.getInstance();

        model.setObserver(new FizzBuzzEntryQueueObserver());

        //model.setDebug(true);
    }


    public void fizzbuzz() {
        FizzBuzzFacade.fizzBuzzerRange(1, 100)
            .stream()
            .forEach(entry -> model.addEntry(entry));

        model.flushQueue();
    }

    public static void main(String[] args) {
        new FizzBuzzApplication().fizzbuzz();
    }
}

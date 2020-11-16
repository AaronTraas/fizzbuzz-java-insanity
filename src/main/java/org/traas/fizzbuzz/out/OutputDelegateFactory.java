package org.traas.fizzbuzz.out;

import org.traas.fizzbuzz.model.FizzBuzzEntryModel;

public class OutputDelegateFactory {

    private final FizzBuzzEntryModel model; 

    public OutputDelegateFactory() {
        model = FizzBuzzEntryModel.getInstance();
    }

    public IOutputDelegate getDelegate() {
        return model.getDebug() ? new DebugOutputDelegate() : new StandardOutputDelegate();
    }
}
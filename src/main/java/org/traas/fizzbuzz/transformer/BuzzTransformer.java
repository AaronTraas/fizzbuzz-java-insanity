package org.traas.fizzbuzz.transformer;

public class BuzzTransformer extends AbstractFizzBuzzTransformer {

    public final int getMultiple() {
        return 5;
    }

    public final String getReplacement() {
        return "Buzz";
    }
}
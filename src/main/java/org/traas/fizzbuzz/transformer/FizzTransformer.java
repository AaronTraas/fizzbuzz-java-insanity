package org.traas.fizzbuzz.transformer;

public class FizzTransformer extends AbstractFizzBuzzTransformer {

    public final int getMultiple() {
        return 3;
    }

    public final String getReplacement() {
        return "Fizz";
    }
}
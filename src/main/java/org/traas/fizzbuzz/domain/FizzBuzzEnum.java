package org.traas.fizzbuzz.domain;

public enum FizzBuzzEnum {
    FIZZ("Fizz", 3),
    BUZZ("Buzz", 5);

    private final String replacement;
    private final int multiple;

    FizzBuzzEnum(String replacement, int multiple) {
        this.replacement = replacement;
        this.multiple = multiple;
    }

    public final String getReplacement() {
        return replacement;
    }

    public final int getMultiple() {
        return multiple;
    }
}
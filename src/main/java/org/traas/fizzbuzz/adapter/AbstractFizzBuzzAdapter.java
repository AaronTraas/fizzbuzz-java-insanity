package org.traas.fizzbuzz.adapter;

public abstract class AbstractFizzBuzzAdapter implements IFizzBuzzAdapter {

    public boolean doesMatch(int n) {
        return n % getEnumValue().getMultiple() == 0;
    }
}
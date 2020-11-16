package org.traas.fizzbuzz.adapter;

import org.traas.fizzbuzz.domain.FizzBuzzEnum;

public interface IFizzBuzzAdapter {

    public FizzBuzzEnum getEnumValue();

    public boolean doesMatch(int n);
}
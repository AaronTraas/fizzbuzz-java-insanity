package org.traas.fizzbuzz.adapter;

import org.traas.fizzbuzz.domain.FizzBuzzEnum;

public class BuzzAdapter extends AbstractFizzBuzzAdapter {

    public FizzBuzzEnum getEnumValue() {
        return FizzBuzzEnum.BUZZ;
    }
}
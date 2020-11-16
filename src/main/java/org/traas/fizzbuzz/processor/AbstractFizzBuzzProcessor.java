package org.traas.fizzbuzz.processor;

import java.util.ArrayList;
import java.util.List;
import org.traas.fizzbuzz.adapter.*;

import org.traas.fizzbuzz.domain.FizzBuzzEntry;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;

public abstract class AbstractFizzBuzzProcessor implements IFizzBuzzProcessor {

    public FizzBuzzEntry process(int n) {
        final List<FizzBuzzEnum> applicableReplacements = new ArrayList<FizzBuzzEnum>();

        for (IFizzBuzzAdapter adapter : this.getAdapterList()) {
            if (adapter.doesMatch(n)) {
                applicableReplacements.add(adapter.getEnumValue());
            }
        }

        return new FizzBuzzEntry(n, applicableReplacements);
    }
}
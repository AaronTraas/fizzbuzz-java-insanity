package org.traas.fizzbuzz.processor;

import java.util.List;
import org.traas.fizzbuzz.adapter.IFizzBuzzAdapter;
import org.traas.fizzbuzz.domain.FizzBuzzEntry;

public interface IFizzBuzzProcessor {

    public List<IFizzBuzzAdapter> getAdapterList();

    public FizzBuzzEntry process(int n);
}
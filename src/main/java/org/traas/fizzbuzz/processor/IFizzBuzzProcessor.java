package org.traas.fizzbuzz.processor;

import java.util.List;
import org.traas.fizzbuzz.transformer.IFizzBuzzTransformer;

public interface IFizzBuzzProcessor {

    public List<IFizzBuzzTransformer> getTransformerList();

    public List<String> process(int n);
}
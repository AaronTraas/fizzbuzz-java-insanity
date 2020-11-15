package org.traas.fizzbuzz.transformer;

public abstract class AbstractFizzBuzzTransformer implements IFizzBuzzTransformer {
    
    public final String transform(int i) {
        return (i % getMultiple() == 0) ? getReplacement() : "";
    }
}
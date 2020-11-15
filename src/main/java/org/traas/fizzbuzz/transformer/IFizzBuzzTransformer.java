package org.traas.fizzbuzz.transformer;

public interface IFizzBuzzTransformer {

    public int getMultiple();

    public String getReplacement();
    
    public String transform(int i);
}
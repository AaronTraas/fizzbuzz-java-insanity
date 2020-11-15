package org.traas.fizzbuzz.processor;

import java.util.ArrayList;
import java.util.List;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;
import org.traas.fizzbuzz.transformer.*;

public class FizzBuzzFizzBuzzProcessor extends AbstractFizzBuzzProcessor {

    public List<IFizzBuzzTransformer> transformerList;

    public final List<IFizzBuzzTransformer> getTransformerList() {
        FizzBuzzTransformerFactory factory = new FizzBuzzTransformerFactory();

        return new ArrayList<IFizzBuzzTransformer>() {{ 
            add(factory.getTransformer(FizzBuzzEnum.FIZZ)); 
            add(factory.getTransformer(FizzBuzzEnum.BUZZ)); 
        }}; 
    }
}

package org.traas.fizzbuzz.processor;

import java.util.ArrayList;
import java.util.List;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;
import org.traas.fizzbuzz.adapter.IFizzBuzzAdapter;
import org.traas.fizzbuzz.adapter.FizzBuzzAdapterFactory;

public class FizzBuzzFizzBuzzProcessor extends AbstractFizzBuzzProcessor {

    public List<IFizzBuzzAdapter> getAdapterList() {
        FizzBuzzAdapterFactory factory = new FizzBuzzAdapterFactory();

        return new ArrayList<IFizzBuzzAdapter>() {{ 
            add(factory.getAdapter(FizzBuzzEnum.FIZZ)); 
            add(factory.getAdapter(FizzBuzzEnum.BUZZ)); 
        }}; 
    }
}

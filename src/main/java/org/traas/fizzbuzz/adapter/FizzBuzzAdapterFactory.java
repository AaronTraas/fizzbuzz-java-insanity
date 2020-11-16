package org.traas.fizzbuzz.adapter;

import java.util.Map;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;
import org.traas.fizzbuzz.exception.InvalidFizzBuzzAdapterException;

public class FizzBuzzAdapterFactory {
    private final Map<FizzBuzzEnum, IFizzBuzzAdapter> adapterMap;

    public FizzBuzzAdapterFactory() {
        adapterMap = Map.of(
                FizzBuzzEnum.FIZZ, new FizzAdapter(),
                FizzBuzzEnum.BUZZ, new BuzzAdapter()
            );
    }

    public final IFizzBuzzAdapter getAdapter(FizzBuzzEnum fb) throws InvalidFizzBuzzAdapterException {
        try {
            return adapterMap.get(fb);
        } catch (NullPointerException e) {
            throw new InvalidFizzBuzzAdapterException(fb);
        }
    }
}
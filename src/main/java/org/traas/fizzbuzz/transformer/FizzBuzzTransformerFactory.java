package org.traas.fizzbuzz.transformer;

import java.util.Map;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;
import org.traas.fizzbuzz.exception.InvalidFizzBuzzTransformerException;

public class FizzBuzzTransformerFactory {
    private final Map<FizzBuzzEnum, IFizzBuzzTransformer> transformerMap;

    public FizzBuzzTransformerFactory() {
        transformerMap = Map.of(
                FizzBuzzEnum.FIZZ, new FizzTransformer(),
                FizzBuzzEnum.BUZZ, new BuzzTransformer()
            );
    }

    public final IFizzBuzzTransformer getTransformer(FizzBuzzEnum fb) throws InvalidFizzBuzzTransformerException {
        try {
            return transformerMap.get(fb);
        } catch (NullPointerException e) {
            throw new InvalidFizzBuzzTransformerException(fb);
        }
    }
}
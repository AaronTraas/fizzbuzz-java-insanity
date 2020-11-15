package org.traas.fizzbuzz.transformer;

import java.util.Map;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;

public class FizzBuzzTransformerFactory {
    private final Map<FizzBuzzEnum, IFizzBuzzTransformer> transformerMap;

    public FizzBuzzTransformerFactory() {
        transformerMap = Map.of(
                FizzBuzzEnum.FIZZ, new FizzTransformer(),
                FizzBuzzEnum.BUZZ, new BuzzTransformer()
            );
    }

    public final IFizzBuzzTransformer getTransformer(FizzBuzzEnum fb) {
        return transformerMap.get(fb);
    }
}
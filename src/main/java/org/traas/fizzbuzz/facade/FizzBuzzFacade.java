package org.traas.fizzbuzz.facade;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream; 

import org.traas.fizzbuzz.domain.FizzBuzzEnum;
import org.traas.fizzbuzz.domain.FizzBuzzEntry;
import org.traas.fizzbuzz.processor.FizzBuzzProcessorFactory;
import org.traas.fizzbuzz.processor.IFizzBuzzProcessor;

public final class FizzBuzzFacade {

    public static List<FizzBuzzEntry> fizzBuzzerRange(int min, int max) {
        return IntStream.range(min, max+1)
            .mapToObj(n -> FizzBuzzFacade.fizzBuzzer(n))
            .collect(Collectors.toList());
    }

    public static FizzBuzzEntry fizzBuzzer(int n) {
        return new FizzBuzzProcessorFactory()
            .getFizzBuzzProcessor(EnumSet.of(FizzBuzzEnum.FIZZ, FizzBuzzEnum.BUZZ))
            .process(n);
    }
}
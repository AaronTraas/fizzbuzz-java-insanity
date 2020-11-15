package org.traas.fizzbuzz.facade;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream; 

import org.traas.fizzbuzz.collector.FizzBuzzCollector;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;
import org.traas.fizzbuzz.processor.FizzBuzzProcessorFactory;
import org.traas.fizzbuzz.processor.IFizzBuzzProcessor;

public final class FizzBuzzFacade {

    public static List<String> fizzBuzzerRange(int min, int max) {
        return IntStream.range(min, max+1)
            .mapToObj(n -> FizzBuzzFacade.fizzBuzzer(n))
            .map(Object::toString)
            .collect(Collectors.toList());
    }

    public static String fizzBuzzer(int n) {
        IFizzBuzzProcessor processor = new FizzBuzzProcessorFactory().getFizzBuzzProcessor(EnumSet.of(FizzBuzzEnum.FIZZ, FizzBuzzEnum.BUZZ));
        return new FizzBuzzCollector().collect(n, processor.process(n));
    }
}
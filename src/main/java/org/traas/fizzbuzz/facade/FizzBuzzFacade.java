package org.traas.fizzbuzz.facade;

import java.util.EnumSet;
import org.traas.fizzbuzz.collector.FizzBuzzCollector;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;
import org.traas.fizzbuzz.processor.FizzBuzzProcessorFactory;
import org.traas.fizzbuzz.processor.IFizzBuzzProcessor;

public final class FizzBuzzFacade {

    public static String fizzBuzzer(int n) {
        IFizzBuzzProcessor processor = new FizzBuzzProcessorFactory().getFizzBuzzProcessor(EnumSet.of(FizzBuzzEnum.FIZZ, FizzBuzzEnum.BUZZ));
        return new FizzBuzzCollector().collect(n, processor.process(n));
    }
}
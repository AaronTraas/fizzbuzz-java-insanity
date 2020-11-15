package org.traas.fizzbuzz.processor;

import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;
import org.traas.fizzbuzz.exception.InvalidFizzBuzzProcessorException;

public class FizzBuzzProcessorFactory {

    private final Map<Set<FizzBuzzEnum>, IFizzBuzzProcessor> processorMap;

    public FizzBuzzProcessorFactory() {
        processorMap = Map.of(
            EnumSet.of(FizzBuzzEnum.FIZZ, FizzBuzzEnum.BUZZ), 
            new FizzBuzzFizzBuzzProcessor()
        );
    }

    public IFizzBuzzProcessor getFizzBuzzProcessor(Set<FizzBuzzEnum> replacements) throws InvalidFizzBuzzProcessorException {
        try {
            return processorMap.get(replacements);
        } catch (NullPointerException e) {
            throw new InvalidFizzBuzzProcessorException(replacements);
        }
    }
}
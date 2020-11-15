package org.traas.fizzbuzz.exception;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;

public class InvalidFizzBuzzProcessorException extends NullPointerException {
    public InvalidFizzBuzzProcessorException(Set<FizzBuzzEnum> fizzBuzzes) {
        super("No FizzBuzzProcessor exists for set of [%s]".format(
                Optional.ofNullable(fizzBuzzes)
                    .orElse(Collections.emptySet())
                    .stream()
                    .map(FizzBuzzEnum::getReplacement)
                    .collect(Collectors.joining(","))
            ));
    }
}
package org.traas.fizzbuzz.exception;

import java.util.Optional;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;

public class InvalidFizzBuzzTransformerException extends NullPointerException {
    public InvalidFizzBuzzTransformerException(FizzBuzzEnum fb) {
        super("No FizzBuzzProcessor exists for set of %s".format(
            Optional.ofNullable(fb)
                .map(FizzBuzzEnum::getReplacement)
                .orElse("[null]")
        ));
    }
}
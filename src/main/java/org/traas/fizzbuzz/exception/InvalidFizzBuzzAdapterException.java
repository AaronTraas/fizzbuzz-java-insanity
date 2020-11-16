package org.traas.fizzbuzz.exception;

import java.util.Optional;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;

public class InvalidFizzBuzzAdapterException extends NullPointerException {
    public InvalidFizzBuzzAdapterException(FizzBuzzEnum fb) {
        super("No FizzBuzzAdapter exists for set of %s".format(
            Optional.ofNullable(fb)
                .map(FizzBuzzEnum::getReplacement)
                .orElse("[null]")
        ));
    }
}
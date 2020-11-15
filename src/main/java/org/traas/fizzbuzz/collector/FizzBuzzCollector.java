package org.traas.fizzbuzz.collector;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FizzBuzzCollector {

    public String collect(int n, List<String> replacements) {
        return Optional.ofNullable(replacements)
                .map(r -> String.join("", r))
                .filter(Predicate.not(String::isEmpty))
                .orElse(String.valueOf(n));
    }
}
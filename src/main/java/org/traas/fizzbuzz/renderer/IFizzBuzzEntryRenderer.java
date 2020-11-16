package org.traas.fizzbuzz.renderer;

import org.traas.fizzbuzz.domain.FizzBuzzEntry;

public interface IFizzBuzzEntryRenderer {
    public String render(FizzBuzzEntry entry);
}
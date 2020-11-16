package org.traas.fizzbuzz.out;

import java.io.PrintStream;

import org.traas.fizzbuzz.domain.FizzBuzzEntry;
import org.traas.fizzbuzz.renderer.IFizzBuzzEntryRenderer;

public interface IOutputDelegate {

    public void out(FizzBuzzEntry entry);

    public PrintStream getOutputStream();

    public IFizzBuzzEntryRenderer getRenderer();
}
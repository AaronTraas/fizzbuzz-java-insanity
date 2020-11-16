package org.traas.fizzbuzz.out;

import java.io.PrintStream;

import org.traas.fizzbuzz.renderer.StandardFizzBuzzEntryRenderer;

public class StandardOutputDelegate extends AbstractOutputDelegate {

    public StandardOutputDelegate() {
        super(new StandardFizzBuzzEntryRenderer());
    }

    public PrintStream getOutputStream() {
        return System.out;
    }
}
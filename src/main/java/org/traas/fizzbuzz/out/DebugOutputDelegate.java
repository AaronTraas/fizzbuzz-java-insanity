package org.traas.fizzbuzz.out;

import java.io.PrintStream;

import org.traas.fizzbuzz.renderer.DebugFizzBuzzEntryRenderer;

public class DebugOutputDelegate extends AbstractOutputDelegate {

    public DebugOutputDelegate() {
        super(new DebugFizzBuzzEntryRenderer());
    }

    public PrintStream getOutputStream() {
        return System.out;
    }
}
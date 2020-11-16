package org.traas.fizzbuzz.out;

import java.io.PrintStream;

public class StandardOutputDelegate extends AbstractOutputDelegate {
    public PrintStream getOutputStream() {
        return System.out;
    }
}
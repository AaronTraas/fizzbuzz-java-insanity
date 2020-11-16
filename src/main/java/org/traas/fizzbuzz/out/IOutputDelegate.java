package org.traas.fizzbuzz.out;

import java.io.PrintStream;

public interface IOutputDelegate {

    public void out(String s);

    public PrintStream getOutputStream();
}
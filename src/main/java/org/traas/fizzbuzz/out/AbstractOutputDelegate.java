package org.traas.fizzbuzz.out;

public abstract class AbstractOutputDelegate implements IOutputDelegate {
    public void out(String s) {
        getOutputStream().println(s);
    }
}
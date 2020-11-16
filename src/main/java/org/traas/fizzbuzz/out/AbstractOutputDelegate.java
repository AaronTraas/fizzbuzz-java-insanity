package org.traas.fizzbuzz.out;

import org.traas.fizzbuzz.domain.FizzBuzzEntry;
import org.traas.fizzbuzz.renderer.IFizzBuzzEntryRenderer;

public abstract class AbstractOutputDelegate implements IOutputDelegate {

    private final IFizzBuzzEntryRenderer renderer;

    public AbstractOutputDelegate(IFizzBuzzEntryRenderer renderer) {
        this.renderer = renderer;
    }

    public IFizzBuzzEntryRenderer getRenderer() {
        return renderer;
    }

    public void out(FizzBuzzEntry entry) {
        getOutputStream().println(getRenderer().render(entry));
    }
}
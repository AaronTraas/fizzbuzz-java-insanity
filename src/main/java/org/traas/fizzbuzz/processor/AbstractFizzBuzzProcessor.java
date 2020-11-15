package org.traas.fizzbuzz.processor;

import java.util.ArrayList;
import java.util.List;
import org.traas.fizzbuzz.transformer.*;

public abstract class AbstractFizzBuzzProcessor implements IFizzBuzzProcessor {

    public List<String> process(int n) {
        final List<String> replacements = new ArrayList<String>();

        for (IFizzBuzzTransformer transformer : this.getTransformerList()) {
            replacements.add(transformer.transform(n));
        }

        return replacements;
    }
}
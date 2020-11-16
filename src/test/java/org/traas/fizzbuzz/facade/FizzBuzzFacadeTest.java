package org.traas.fizzbuzz.facade;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

import org.traas.fizzbuzz.domain.FizzBuzzEntry;
import org.traas.fizzbuzz.domain.FizzBuzzEnum;

public class FizzBuzzFacadeTest {
    
    @Test 
    public void test_fizzBuzzer_1is1() {
        final FizzBuzzEntry entry = new FizzBuzzFacade().fizzBuzzer(1);
        assertTrue(entry.getReplacements().isEmpty());
        assertEquals(1, entry.getNumber());
    }

    @Test 
    public void test_fizzBuzzer_3isFizz() {
        final FizzBuzzEntry entry = new FizzBuzzFacade().fizzBuzzer(3);
        assertEquals(1, entry.getReplacements().size());
        assertEquals(FizzBuzzEnum.FIZZ, entry.getReplacements().get(0));
    }

    @Test 
    public void test_fizzBuzzer_5isBuzz() {
        final FizzBuzzEntry entry = new FizzBuzzFacade().fizzBuzzer(5);
        assertEquals(1, entry.getReplacements().size());
        assertEquals(FizzBuzzEnum.BUZZ, entry.getReplacements().get(0));
    }

    @Test 
    public void test_fizzBuzzer_15isFizzBuzz() {
        final FizzBuzzEntry entry = new FizzBuzzFacade().fizzBuzzer(15);
        assertEquals(2, entry.getReplacements().size());
        assertEquals(FizzBuzzEnum.FIZZ, entry.getReplacements().get(0));
        assertEquals(FizzBuzzEnum.BUZZ, entry.getReplacements().get(1));
    }

    @Test 
    public void test_fizzBuzzerRange_1contains1() {
        final List<FizzBuzzEntry> entries = new FizzBuzzFacade().fizzBuzzerRange(1, 1);
        assertEquals(1, entries.size());

        final FizzBuzzEntry entry = entries.get(0);
        assertTrue(entry.getReplacements().isEmpty());
        assertEquals(1, entry.getNumber());
    }

    @Test 
    public void test_fizzBuzzerRange_15contains15withReplacements() {
        final List<FizzBuzzEntry> entries = new FizzBuzzFacade().fizzBuzzerRange(1, 15);
        assertEquals(15, entries.size());

        assertTrue(entries.get(0).getReplacements().isEmpty());
        assertTrue(entries.get(1).getReplacements().isEmpty());
        assertEquals(1, entries.get(2).getReplacements().size());
        assertEquals(FizzBuzzEnum.FIZZ, entries.get(2).getReplacements().get(0));
        assertTrue(entries.get(3).getReplacements().isEmpty());
        assertEquals(1, entries.get(4).getReplacements().size());
        assertEquals(FizzBuzzEnum.BUZZ, entries.get(4).getReplacements().get(0));
        assertEquals(1, entries.get(5).getReplacements().size());
        assertEquals(FizzBuzzEnum.FIZZ, entries.get(5).getReplacements().get(0));
        assertTrue(entries.get(6).getReplacements().isEmpty());
        assertTrue(entries.get(7).getReplacements().isEmpty());
        assertEquals(1, entries.get(8).getReplacements().size());
        assertEquals(FizzBuzzEnum.FIZZ, entries.get(8).getReplacements().get(0));
        assertEquals(1, entries.get(9).getReplacements().size());
        assertEquals(FizzBuzzEnum.BUZZ, entries.get(9).getReplacements().get(0));
        assertTrue(entries.get(10).getReplacements().isEmpty());
        assertEquals(1, entries.get(11).getReplacements().size());
        assertEquals(FizzBuzzEnum.FIZZ, entries.get(11).getReplacements().get(0));
        assertTrue(entries.get(12).getReplacements().isEmpty());
        assertTrue(entries.get(13).getReplacements().isEmpty());
        assertEquals(2, entries.get(14).getReplacements().size());
        assertEquals(FizzBuzzEnum.FIZZ, entries.get(14).getReplacements().get(0));
        assertEquals(FizzBuzzEnum.BUZZ, entries.get(14).getReplacements().get(1));
    }
}

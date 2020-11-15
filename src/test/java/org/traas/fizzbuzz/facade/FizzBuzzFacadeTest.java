package org.traas.fizzbuzz.facade;

import org.junit.Test;
import static org.junit.Assert.*;

import org.traas.fizzbuzz.domain.FizzBuzzEnum;

public class FizzBuzzFacadeTest {
    
    @Test 
    public void test1is1() {
        assertEquals("1", new FizzBuzzFacade().fizzBuzzer(1));
    }

    @Test 
    public void test3isFizz() {
        assertEquals(FizzBuzzEnum.FIZZ.getReplacement(), new FizzBuzzFacade().fizzBuzzer(3));
    }

    @Test 
    public void test5isBuzz() {
        assertEquals(FizzBuzzEnum.BUZZ.getReplacement(), new FizzBuzzFacade().fizzBuzzer(5));
    }

    @Test 
    public void test15isFizzBuzz() {
        assertEquals(FizzBuzzEnum.FIZZ.getReplacement()+FizzBuzzEnum.BUZZ.getReplacement(), new FizzBuzzFacade().fizzBuzzer(15));
    }
}

package org.traas.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzApplicationTest {
    
    @Test 
    public void testAppHasAGreeting() {
        FizzBuzzApplication classUnderTest = new FizzBuzzApplication();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}

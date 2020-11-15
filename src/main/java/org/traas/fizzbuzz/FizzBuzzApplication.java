package org.traas.fizzbuzz;

import org.traas.fizzbuzz.facade.FizzBuzzFacade;

/**
 * 
 */
public class FizzBuzzApplication {

    public String getGreeting() {
        return "Hello world FizzBuzzApplication.";
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(FizzBuzzFacade.fizzBuzzer(i));
        }
    }
}

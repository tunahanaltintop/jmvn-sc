package com.tun.test;

import com.tun.sample.Calculator;
import com.tun.sample.CalculatorSoap;
import org.junit.Test;

public class SampleTest {

    @Test
    public void calculatorTest() {
        Calculator calculator = new Calculator();
        CalculatorSoap calculatorSoap = calculator.getCalculatorSoap();

        int a = 2;
        int b = 3;
        int c = 6;

        System.out.println(a + " + " + b + " = " + calculatorSoap.add(a, b));
        System.out.println(b + " - " + a + " = " + calculatorSoap.subtract(b, a));
        System.out.println(a + " * " + b + " = " + calculatorSoap.multiply(a, b));
        System.out.println(c + " / " + a + " = " + calculatorSoap.divide(c, a));
    }
}

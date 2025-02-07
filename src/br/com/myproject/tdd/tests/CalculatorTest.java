package br.com.myproject.tdd.tests;

import br.com.myproject.tdd.classes.models.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void sumOfTwoPositiveNumbers(){
        Calculator calculator = new Calculator();
        int res = calculator.add(3, 7);

        Assertions.assertEquals(10, res);
    }

    @Test
    void sumOfPositiveNumberAndZero(){
        Calculator calculator = new Calculator();
        int res = calculator.add(3, 0);

        Assertions.assertEquals(3, res);
    }

    @Test
    void sumOfPositiveNumberAndNegativeNumber(){
        Calculator calculator = new Calculator();
        int res = calculator.add(6, -2);

        Assertions.assertEquals(4, res);
    }
}
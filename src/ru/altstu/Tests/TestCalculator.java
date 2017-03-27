package ru.altstu.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.altstu.Logic.Calculator;

/**
 * Created by sergey on 27/03/2017.
 */
public class TestCalculator {

    @Test
    void calcClassCreationTest() {
        Calculator calculator = new Calculator();
        Assertions.assertNotNull(calculator);
    }

    @Test
    void calcAdd2and2Test() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void calcAdd2and1Test() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(3, calculator.add(2, 1));
    }


}

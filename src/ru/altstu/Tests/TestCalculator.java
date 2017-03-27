package ru.altstu.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by sergey on 27/03/2017.
 */
public class TestCalculator {

    @Test
    void calcClassCreationTest() {
        Calculator calculator = new Calculator();
        Assertions.assertNotNull(calculator);
    }



}

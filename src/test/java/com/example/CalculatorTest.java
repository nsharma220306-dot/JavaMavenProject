
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(10, c.add(5, 5));
    }

    @Test
    void testSub() {
        Calculator c = new Calculator();
        assertEquals(5, c.sub(10, 5));
    }
}

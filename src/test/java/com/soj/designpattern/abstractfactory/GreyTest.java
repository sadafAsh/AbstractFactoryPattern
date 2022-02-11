package com.soj.designpattern.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreyTest {

    @Test
    void testToGetGreyColorpassed() {
        String value = "grey";
        Color color = new Grey();
        String result = color.getColor();
        Assertions.assertEquals(result, value);
    }

    @Test
    void testToGetGreyColorFailed() {
        String value = "grey color";
        Color color = new Grey();
        String result = color.getColor();
        Assertions.assertNotEquals(result, value);
    }
}
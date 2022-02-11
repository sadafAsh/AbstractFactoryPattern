package com.soj.designpattern.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackTest {


    @Test
    void testToGetGreyColorpassed() {
        String value = "black";
        Color color = new Black();
        String result = color.getColor();
        Assertions.assertEquals(result, value);
        Assertions.assertSame("black",result);
    }

    @Test
    void testToGetGreyColorFailed() {
        String value = "grey color";
        Color color = new Black();
        String result = color.getColor();
        Assertions.assertNotEquals(result, value);
    }
}
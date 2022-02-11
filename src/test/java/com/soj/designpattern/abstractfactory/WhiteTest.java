package com.soj.designpattern.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiteTest {

    @Test
    void testToGetWhiteColorpassed() {
        String value="white";
        White white=new White();
        String result=white.getColor();
        Assertions.assertEquals(result,value);
    }

    @Test
    void testToGetWhiteColorFailed() {
        String value="white color";
        White white=new White();
        String result=white.getColor();
        Assertions.assertNotEquals(result,value);
}}
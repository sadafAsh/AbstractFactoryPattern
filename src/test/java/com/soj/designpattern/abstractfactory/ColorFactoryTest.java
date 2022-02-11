package com.soj.designpattern.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorFactoryTest {

    protected Color color;

    @Test
    void testToCreateWhite() {
        ColorFactory colorFactory = new ColorFactory();
        color = new White();
        color = colorFactory.create("white");
        color.getColor();
        Assertions.assertEquals("white", color.getColor());
    }

    @Test
    void testToCreateBlack() {
        ColorFactory colorFactory=new ColorFactory();
        color = new Black();
        color = colorFactory.create("black");
        color.getColor();
        Assertions.assertEquals("black", color.getColor());

    }
    @Test
    void testToGetColorFactory() {

        ColorFactory colorFactory=new ColorFactory();
        color=colorFactory.create("black");
        Assertions.assertTrue(color instanceof Black);

    }

    @Test
    void testToCreateGrey() {
        ColorFactory colorFactory=new ColorFactory();
        color= new Grey();
        color=colorFactory.create("grey");
        color.getColor();
        Assertions.assertEquals("grey", color.getColor());

    }
    @Test
    void testToGetNull(){
        ColorFactory colorFactory=new ColorFactory();
        color = colorFactory.create("");
        Assertions.assertSame(null,color);
        Assertions.assertNull(color);
        Assertions.assertSame(null,color);

    }

}
package com.soj.designpattern.abstractfactory;

import javax.swing.plaf.synth.ColorType;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        if (type.equalsIgnoreCase("black")){
            return new Black();
        }
        if (type.equalsIgnoreCase("white")){
            return new White();
        }
        if (type.equalsIgnoreCase("grey")){
            return new Grey();
        }
        return null;
    }
}

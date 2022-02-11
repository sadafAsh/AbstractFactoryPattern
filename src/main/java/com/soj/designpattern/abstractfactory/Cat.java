package com.soj.designpattern.abstractfactory;

public class Cat implements Animal {

    @Override
    public String getAnimal() {
        return "cat";
    }

    @Override
    public String getSound() {
        return "meow";
    }
}

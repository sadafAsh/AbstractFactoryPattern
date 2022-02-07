package com.soj.designpattern.abstractfactory;

public class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String getSound() {
        return "squeak";
    }
}

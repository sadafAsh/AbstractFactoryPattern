package com.soj.designpattern.abstractfactory;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String getSound() {
        return "bark";
    }
}

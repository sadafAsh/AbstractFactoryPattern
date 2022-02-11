package com.soj.designpattern.abstractfactory;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "dog";
    }

    @Override
    public String getSound() {
        return "bark";
    }
}

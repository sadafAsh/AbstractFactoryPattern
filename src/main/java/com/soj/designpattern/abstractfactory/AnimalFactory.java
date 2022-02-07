package com.soj.designpattern.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal>{

    @Override
    public Animal create(String type) {
        if (type.equalsIgnoreCase("dog")){
            return new Dog();
        }
        if (type.equalsIgnoreCase("cat")){
            return new Cat();
        }
        if (type.equalsIgnoreCase("duck")){
            return new Duck();
        }
        return null;
    }
}

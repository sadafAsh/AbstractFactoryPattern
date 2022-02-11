package com.soj.designpattern.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalFactoryTest {
    protected Animal animal;

    @Test
    void testToCreateDog() {
        AnimalFactory animalFactory = new AnimalFactory();
        animal = new Dog();
        animal = animalFactory.create("dog");
        animal.getAnimal();
        animal.getSound();
        Assertions.assertEquals("dog", animal.getAnimal());


    }

    @Test
    void testToCreateCat() {
        AnimalFactory animalFactory = new AnimalFactory();
        animal = new Cat();
        animal = animalFactory.create("cat");
        animal.getAnimal();
        animal.getSound();
        Assertions.assertEquals("cat", animal.getAnimal());

    }

    @Test
    void testToCreateDuck() {
        AnimalFactory animalFactory = new AnimalFactory();
        animal = new Duck();
        animal = animalFactory.create("duck");
        animal.getAnimal();
        animal.getSound();
        Assertions.assertEquals("duck", animal.getAnimal());

    }
    @Test
    void testToGetNull(){
        AnimalFactory animalFactory = new AnimalFactory();
         animal = animalFactory.create("");
        Assertions.assertSame(null,animal);
        Assertions.assertNull(animal);
           Assertions.assertSame(null,animal);

    }
}
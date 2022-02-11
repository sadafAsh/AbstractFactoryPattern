package com.soj.designpattern.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    void testToGetAnAnimalAsDogShouldPassed() {
        String value = "dog";
        Animal animal = new Dog();
        String result = animal.getAnimal();
        Assertions.assertEquals(result, value);
    }

    @Test
    void testToGetAnAnimalAsDogShouldFailed() {
        String value = "DogAnimal";
        Animal animal = new Dog();
        String result = animal.getAnimal();
        Assertions.assertNotEquals(result, value);
    }
    @Test
    void testToGetSoundOfDogShouldPassed() {
        String value = "bark";
        Animal animal = new Dog();
        String result = animal.getSound();
        Assertions.assertEquals(result, value);
    }

    @Test
    void testToGetSoundOfDogShouldFailed() {
        String value = "meowi";
        Animal animal = new Dog();
        String result = animal.getSound();
        Assertions.assertNotEquals(result, value);
    }
}
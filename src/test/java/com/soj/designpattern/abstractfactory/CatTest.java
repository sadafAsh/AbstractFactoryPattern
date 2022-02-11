package com.soj.designpattern.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testToGetAnAnimalAsCatShouldPassed() {
        String value = "cat";
        Animal animal = new Cat();
        String result = animal.getAnimal();
        Assertions.assertEquals(result, value);
    }

    @Test
    void testToGetAnAnimalAsCatShouldFailed() {
        String value = "CatAnimal";
        Animal animal = new Cat();
        String result = animal.getAnimal();
        Assertions.assertNotEquals(result, value);
    }
    @Test
    void testToGetSoundOfCatShouldPassed() {
        String value = "meow";
        Animal animal = new Cat();
        String result = animal.getSound();
        Assertions.assertEquals(result, value);
    }

    @Test
    void testToGetSoundOfCatShouldFailed() {
        String value = "meowi";
        Animal animal = new Cat();
        String result = animal.getSound();
        Assertions.assertNotEquals(result, value);
}
}
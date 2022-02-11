package com.soj.designpattern.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void testToGetAnAnimalAsDuckShouldPassed() {
        String value = "duck";
        Animal animal = new Duck();
        String result = animal.getAnimal();
        Assertions.assertEquals(result, value);
    }

    @Test
    void testToGetAnAnimalAsDuckShouldFailed() {
        String value = "DuckAnimal";
        Animal animal = new Duck();
        String result = animal.getAnimal();
        Assertions.assertNotEquals(result, value);
    }
    @Test
    void testToGetSoundOfDuckShouldPassed() {
        String value = "squeak";
        Animal animal = new Duck();
        String result = animal.getSound();
        Assertions.assertEquals(result, value);
    }

    @Test
    void testToGetSoundOfDogShouldFailed() {
        String value = "meowi";
        Animal animal = new Duck();
        String result = animal.getSound();
        Assertions.assertNotEquals(result, value);
    }
}
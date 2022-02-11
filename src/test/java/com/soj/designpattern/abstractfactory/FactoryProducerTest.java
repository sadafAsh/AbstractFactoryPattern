package com.soj.designpattern.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryProducerTest {
protected  AbstractFactory animalFactory;
protected Animal animal;
    @Test
    void testToGetAnimalFactory() {

        FactoryProducer factoryProducer=new FactoryProducer();
        animalFactory=factoryProducer.getFactory(true);
        Assertions.assertTrue(animalFactory instanceof AnimalFactory);
    }
    @Test
    void testToGetColorFactory() {

        FactoryProducer factoryProducer=new FactoryProducer();
        animalFactory=factoryProducer.getFactory(false);
        Assertions.assertTrue(animalFactory instanceof ColorFactory);
    }

}
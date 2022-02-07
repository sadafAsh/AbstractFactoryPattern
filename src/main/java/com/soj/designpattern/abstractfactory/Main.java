package com.soj.designpattern.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger= LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){
        FactoryProducer factoryProducer=new FactoryProducer();

        AbstractFactory<Animal> animal=factoryProducer.getFactory(true);
        Animal dog=animal.create("dog");
        logger.info("The animal is {}",dog.getAnimal());
        logger.info("The sound of animal is {} ",dog.getSound());

        AbstractFactory<Color> color=factoryProducer.getFactory(false);
        Color color1=color.create("black");
        logger.info("The colour of dog is {}",color1.getColor());






    }
}

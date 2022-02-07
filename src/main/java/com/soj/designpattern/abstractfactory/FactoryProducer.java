package com.soj.designpattern.abstractfactory;

public class FactoryProducer {

    public  <T> AbstractFactory<T> getFactory(boolean animal){
        if (animal){
            return(AbstractFactory<T>) (new AnimalFactory());


        }else {
            return(AbstractFactory<T>) new ColorFactory();
        }
    }
}

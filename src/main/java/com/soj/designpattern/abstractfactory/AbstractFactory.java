package com.soj.designpattern.abstractfactory;

public interface AbstractFactory<T> {
    public  T create(String type);
}


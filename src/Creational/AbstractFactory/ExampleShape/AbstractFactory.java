package Creational.AbstractFactory.ExampleShape;

public abstract class AbstractFactory
{
    abstract Color getColor(String color);
    abstract Shape getShape(String sahpe);
}

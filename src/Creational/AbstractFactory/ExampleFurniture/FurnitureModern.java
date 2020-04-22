package Creational.AbstractFactory.ExampleFurniture;

public class FurnitureModern implements Furniture {

    @Override
    public Chair createChair() {
        return new ChairModern();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new CoffeTableModern();
    }

    @Override
    public Sofa createSofa() {
        return new SofaModern();
    }
}

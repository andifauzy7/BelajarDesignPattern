package Creational.AbstractFactory.ExampleFurniture;

public class FurnitureVictorian implements Furniture {
    @Override
    public Chair createChair() {
        return new ChairVictorian();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new CoffeTableVictorian();
    }

    @Override
    public Sofa createSofa() {
        return new SofaVictorian();
    }
}

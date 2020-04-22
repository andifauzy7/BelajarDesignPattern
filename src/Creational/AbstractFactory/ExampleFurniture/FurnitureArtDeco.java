package Creational.AbstractFactory.ExampleFurniture;

public class FurnitureArtDeco implements Furniture {

    @Override
    public Chair createChair() {
        return new ChairArtDeco();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new CoffeTableArtDeco();
    }

    @Override
    public Sofa createSofa() {
        return new SofaArtDeco();
    }
}

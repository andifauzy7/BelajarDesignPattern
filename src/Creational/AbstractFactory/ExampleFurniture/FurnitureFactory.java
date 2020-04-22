package Creational.AbstractFactory.ExampleFurniture;

public class FurnitureFactory extends AbstractFactory{
    @Override
    Furniture getFurniture(String Type) {
        if(Type.equalsIgnoreCase("ARTDECO")){
            return new FurnitureArtDeco();
        } else if(Type.equalsIgnoreCase("MODERN")){
            return new FurnitureModern();
        } else if(Type.equalsIgnoreCase("VICTORIAN")){
            return new FurnitureVictorian();
        }
        return null;
    }
}

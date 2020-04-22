package Creational.AbstractFactory.ExampleFurniture;

public class Apps {
    public static void main(String[] args) {
        Furniture Produk = new FurnitureFactory().getFurniture("MODERN");
        Chair Kursi = Produk.createChair();
        Kursi.TypeChair();
    }
}

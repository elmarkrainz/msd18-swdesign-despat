package at.fhj.msd.swdesign.factorymethod;

public class ProductFactory {

    public static Product createProduct() {

        return new ConcreteProduct();

    }
}

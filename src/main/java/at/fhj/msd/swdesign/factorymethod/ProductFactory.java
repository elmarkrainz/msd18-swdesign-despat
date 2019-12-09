package at.fhj.msd.swdesign.factorymethod;

public class ProductFactory {

    public static Product createProduct(int type) {

        switch (type) {
            case 1:
                return new AnotherProduct();

            default:
                return new ConcreteProduct();
        }
    }
}

package at.fhj.msd.swdesign.factorymethod;

public class FactoryMain {


    public static void main(String[] args) {


        Product p ;
        p = ProductFactory.createProduct(1);

        p = ProductFactory.createProduct(0);


    }
}

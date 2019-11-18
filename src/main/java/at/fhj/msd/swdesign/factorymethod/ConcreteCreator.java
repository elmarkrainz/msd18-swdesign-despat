package at.fhj.msd.swdesign.factorymethod;


public class ConcreteCreator extends Creator {


    @Override
    Product factoryMethod() {
        // irgendein Product erzeugen

        return  new AnotherProduct();
    }
}

package at.fhj.msd.swdesign.factorymethod;


public class ConcreteCreator extends Creator {

    Product factoryMethod() {
        return new ConcreteProduct();
    }

}

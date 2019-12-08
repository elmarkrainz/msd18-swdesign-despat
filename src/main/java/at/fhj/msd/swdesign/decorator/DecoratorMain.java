package at.fhj.msd.swdesign.decorator;

public class DecoratorMain {

    public static void main(String[] args) {


        Component someComponent = new ConcreteComponent();

        Decorator decoratorA = new ConcreteDecorator(someComponent);

        Decorator decoratorB = new AnotherDecorator(decoratorA);

        decoratorB.operation();
    }
}

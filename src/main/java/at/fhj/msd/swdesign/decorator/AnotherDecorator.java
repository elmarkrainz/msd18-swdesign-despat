package at.fhj.msd.swdesign.decorator;

public class AnotherDecorator extends Decorator {


    public AnotherDecorator(Component component) {
        super(component);
    }

    @Override
    void operation() {
        component.operation();

        System.out.println("another operation");
    }
}

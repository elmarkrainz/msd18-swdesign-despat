package at.fhj.msd.swdesign.decorator;

public class ConcreteDecorator extends Decorator {


    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    void operation() {
        component.operation();
        System.out.println("do new operation");
    }


}

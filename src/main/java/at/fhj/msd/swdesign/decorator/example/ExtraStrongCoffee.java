package at.fhj.msd.swdesign.decorator.example;

public class ExtraStrongCoffee extends CoffeeDecorator{

    public ExtraStrongCoffee(ICoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void enjoy() {
        super.enjoy();
        System.out.println("extra strong,");
    }


}

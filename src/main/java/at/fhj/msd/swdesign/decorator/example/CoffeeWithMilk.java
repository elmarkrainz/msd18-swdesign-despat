package at.fhj.msd.swdesign.decorator.example;

public class CoffeeWithMilk extends CoffeeDecorator{

    public CoffeeWithMilk(ICoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void enjoy() {
        super.enjoy();
        System.out.println("with milk,");
    }


}

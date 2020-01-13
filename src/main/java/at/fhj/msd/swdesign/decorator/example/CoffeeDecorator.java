package at.fhj.msd.swdesign.decorator.example;

public abstract class CoffeeDecorator implements ICoffee {
    protected ICoffee decoratedCoffee;

    public CoffeeDecorator(ICoffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }

    public void enjoy(){
        decoratedCoffee.enjoy();
    }
}

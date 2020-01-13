package at.fhj.msd.swdesign.decorator.example;

public class DecoratorPatternDemo {


    public static void main(String[] args) {

        CoffeeBlack coffeeBlack = new CoffeeBlack();


        CoffeeDecorator decorator1 = new ExtraStrongCoffee(coffeeBlack);
        CoffeeDecorator decorator2= new CoffeeWithMilk(decorator1);

        decorator2.enjoy();


    }
}

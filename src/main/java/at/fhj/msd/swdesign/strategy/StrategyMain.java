package at.fhj.msd.swdesign.strategy;

public class StrategyMain {

    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new CongreteStrategyA());
        context.operate();

        context.setStrategy(new CongreteStrategyB());
        context.operate();

        context.setStrategy(new CongreteStrategyA());
        context.operate();
    }
}

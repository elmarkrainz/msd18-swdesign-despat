package at.fhj.msd.swdesign.decorator;


public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    abstract void operation();
}

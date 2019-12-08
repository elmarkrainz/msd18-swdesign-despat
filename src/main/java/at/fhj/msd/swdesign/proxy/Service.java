package at.fhj.msd.swdesign.proxy;

public class Service implements ServiceInterface {
    @Override
    public void operation() {
        System.out.println("this is the service");
    }
}

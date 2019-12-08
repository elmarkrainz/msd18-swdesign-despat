package at.fhj.msd.swdesign.proxy;

public class Proxy implements ServiceInterface {

    Service service;

    public Proxy(Service service){
        this.service = service;
    }

    @Override
    public void operation() {
        System.out.println("proxy:");
        service.operation();
    }
}

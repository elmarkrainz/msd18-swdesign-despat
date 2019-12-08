package at.fhj.msd.swdesign.proxy;

public class ProxyMain {

    public static void main(String[] args) {



        Service service = new Service();
        service.operation();

        ServiceInterface proxy = new Proxy(service);
        proxy.operation();

    }
}

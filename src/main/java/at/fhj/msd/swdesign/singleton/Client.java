package at.fhj.msd.swdesign.singleton;

public class Client {

    private Singleton singletonInstance;

    public Client(){
        singletonInstance = Singleton.getInstance();
    }

    public void printSingletonInstance() {

        System.out.println(singletonInstance);
    }




    public static void main(String[] args) {

        Client clientA = new Client();
        Client clientB = new Client();
        Client clientC = new Client();

        clientC.printSingletonInstance();
        clientB.printSingletonInstance();
        clientA.printSingletonInstance();
    }
}

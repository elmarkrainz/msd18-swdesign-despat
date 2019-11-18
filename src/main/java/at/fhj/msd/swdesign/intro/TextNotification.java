package at.fhj.msd.swdesign.intro;

public class TextNotification implements  Notification{


    @Override
    public void sendNotification(String msg) {
            System.out.println("NOTIFICATION - " + msg);

    }
}

package at.fhj.msd.swdesign.intro;

public class DownloadApp {

    public static void main(String[] args) {
        Downloader downloader = new Downloader();
        TextNotification textNotification = new TextNotification();


        downloader.setNotification(textNotification);


        downloader.download(2000);


        //textNotification.sendNotification("fertig?");

    }

}

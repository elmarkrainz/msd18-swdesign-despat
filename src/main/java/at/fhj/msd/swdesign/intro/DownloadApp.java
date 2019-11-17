package at.fhj.msd.swdesign.intro;

public class DownloadApp {

    public static void main(String[] args) {
        Downloader downloader = new Downloader();

        TextNotification textNotification = new TextNotification();
        downloader.download(1000);

    }

}

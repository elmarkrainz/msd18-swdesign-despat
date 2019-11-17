package at.fhj.msd.swdesign.intro;

public class Downloader {

    public void download(int millis) {

        System.out.println("start download");
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("download finished");
    }

}

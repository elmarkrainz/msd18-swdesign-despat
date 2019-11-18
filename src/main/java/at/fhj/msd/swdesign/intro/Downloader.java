package at.fhj.msd.swdesign.intro;

public class Downloader {

    public void download(final int millis) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start download");
                try {
                    Thread.sleep(millis);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("download finished");

            }
        });

        thread.start();


    }

}

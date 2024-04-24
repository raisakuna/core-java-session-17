package dockerexample;

import java.time.LocalTime;

public class TimesNowApp {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i =0; i <=100; i++){
                    System.out.println("Time on the server is : "+LocalTime.now());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };

        Thread t = new Thread(runnable);
        t.start();
    }

}

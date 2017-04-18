package zadanie1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Piotrek on 2017-04-09.
 */
public class WatekNieparzyste extends Thread {
    private int liczba = 1;
    private final Object mutex;

    public WatekNieparzyste(Object mutex){
        this.mutex = mutex;
    }
    @Override
    synchronized public void run() {
        while (liczba<100) {
            synchronized (mutex){
                System.out.println(liczba);
                liczba += 2;
                mutex.notify();
                try {
                    mutex.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

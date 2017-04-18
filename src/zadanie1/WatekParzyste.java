package zadanie1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Piotrek on 2017-04-09.
 */
public class WatekParzyste extends Thread {
    private int liczba = 2;
    private final Object mutex;

    public WatekParzyste(Object mutex){
        this.mutex = mutex;
    }
    @Override
    public void run() {
        while (liczba < 100){
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

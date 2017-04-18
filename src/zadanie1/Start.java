package zadanie1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Piotrek on 2017-04-09.
 */
public class Start {
    public static void main(String[] args) {
        Object mutex = new Object();
        Thread thread1 = new WatekNieparzyste(mutex);
        Thread thread2 = new WatekParzyste(mutex);

        WatekNieparzyste.isRun=true;
        thread1.start();
        thread2.start();
    }
}

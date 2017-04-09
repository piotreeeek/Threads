package zadanie1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Piotrek on 2017-04-09.
 */
public class Start {
    public static void main(String[] args) {
        AtomicInteger aInt = new AtomicInteger(0);
        Thread thread1 = new WatekNieparzyste(aInt);
        Thread thread2 = new WatekParzyste(aInt);


        thread1.start();
        thread2.start();
    }
}

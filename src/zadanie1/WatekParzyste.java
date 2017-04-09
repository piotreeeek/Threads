package zadanie1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Piotrek on 2017-04-09.
 */
public class WatekParzyste extends Thread {
    private AtomicInteger aInt;

    public WatekParzyste(AtomicInteger aInt){
        this.aInt = aInt;
    }
    @Override
    public void run() {
        while (aInt.get() < 100){
                if (aInt.get() % 2 == 1) {
                    System.out.println(aInt.incrementAndGet());
                }
        }
    }
}

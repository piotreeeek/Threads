package zadanie1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Piotrek on 2017-04-09.
 */
public class WatekNieparzyste extends Thread {
    private AtomicInteger aInt;

    public WatekNieparzyste(AtomicInteger aInt){
        this.aInt = aInt;
    }
    @Override
    public void run() {
        while (aInt.get()<100) {
                if (aInt.get() % 2 == 0) {
                    System.out.println(aInt.incrementAndGet());
                }
        }
    }
}

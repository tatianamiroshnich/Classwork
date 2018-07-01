package lesson20;

/**
 * Created by student on 7/1/2018.
 */
public class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.print(i);
                System.out.println(" Run by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

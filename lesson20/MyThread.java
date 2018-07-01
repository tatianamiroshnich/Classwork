package lesson20;

/**
 * Created by student on 7/1/2018.
 */
public class MyThread extends Thread {
    public void run(){
        for (int i=0; i<100; i++){
            System.out.println('c');
        }
    }
}

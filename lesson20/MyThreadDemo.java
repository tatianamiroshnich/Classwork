package lesson20;

/**
 * Created by student on 7/1/2018.
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i<20; i++){
            System.out.println('a');
        }
    }
}

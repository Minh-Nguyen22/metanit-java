package multi_threading.locks;

import java.util.concurrent.locks.ReentrantLock;

public class Program {

    public static void main(String[] args) {

        CommonResource commonResource = new CommonResource();
        ReentrantLock locker = new ReentrantLock();

        for (int i = 1; i < 6; i++) {

            Thread thread = new Thread(new CountThread(commonResource, locker));
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}

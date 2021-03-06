package multi_threading.locks;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.locks.ReentrantLock;

public class CountThread implements Runnable{

    CommonResource resource;
    ReentrantLock locker;
    CountThread(CommonResource resource, ReentrantLock lock) {
        this.resource = resource;
        this.locker = lock;
    }

    @Override
    public void run() {

        locker.lock();

        try {
            resource.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), resource.x);
                resource.x++;
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        finally {
            locker.unlock();
        }

    }
}

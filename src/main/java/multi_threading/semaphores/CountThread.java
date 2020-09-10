package multi_threading.semaphores;

import java.util.concurrent.Semaphore;

public class CountThread implements Runnable {

    CommonResource resource;
    Semaphore semaphore;
    String name;

    CountThread(CommonResource resource, Semaphore semaphore, String name) {
        this.name = name;
        this.resource = resource;
        this.semaphore = semaphore;
    }


    @Override
    public void run() {

        try {
            System.out.println(name + " ожидает разрешиения");
            semaphore.acquire();
            resource.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + ": " + resource.x);
                resource.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " освобождает разрешение");
        semaphore.release();
    }
}


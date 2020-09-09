package multi_threading.ending_thread;

public class Program {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        MyThread myThread = new MyThread();
        new Thread(myThread, "MyThread").start();
        new Thread(myThread, "MyThread 2").start();

        try {
            Thread.sleep(110000);

            myThread.disable();
//
//            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished");
    }
}

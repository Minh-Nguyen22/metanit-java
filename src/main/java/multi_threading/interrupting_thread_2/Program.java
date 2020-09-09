package multi_threading.interrupting_thread_2;

public class Program {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread, "MyThread");
        thread.start();

        try {
            Thread.sleep(150);
            thread.interrupt();

            Thread.sleep(150);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}

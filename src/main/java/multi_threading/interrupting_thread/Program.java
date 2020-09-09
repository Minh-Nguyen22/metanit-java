package multi_threading.interrupting_thread;

public class Program {
    public static void main(String[] args) {

        System.out.println("Main thread started...");
        JThread jThread = new JThread("JThread");
        jThread.start();

        try {
            Thread.sleep(150);
            jThread.interrupt();

            Thread.sleep(15000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished");
    }
}

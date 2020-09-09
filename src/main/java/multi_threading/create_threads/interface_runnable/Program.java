package multi_threading.create_threads.interface_runnable;

public class Program {
    public static void main(String[] args) {

        System.out.println("Main thread started...");
        Thread myThread = new Thread( new MyThread(),"MyThread");
        myThread.start();
        System.out.println("Main thread finished...");
    }
}


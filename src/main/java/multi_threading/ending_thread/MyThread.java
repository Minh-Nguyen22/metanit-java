package multi_threading.ending_thread;

public class MyThread implements Runnable{

    private boolean isActive;

    void disable(){
        isActive = false;
    }

    MyThread(){
        isActive = true;
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1;
        while(isActive){
            System.out.println("Loop " + Thread.currentThread().getName() + " " + counter++);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
        System.out.printf("%s finished \n", Thread.currentThread().getName());
    }
}

package multi_threading.waiting_and_notifying;

public class Program {

    public static void main(String[] args) {

        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(consumer).start();
        new Thread(producer).start();

    }
}

package multi_threading.class_exchanger;

import java.util.concurrent.Exchanger;

public class Program {

    public static void main(String[] args) {

        Exchanger<String> exchanger = new Exchanger<String>();
        new Thread(new PutThread(exchanger)).start();
        new Thread(new GetThread(exchanger)).start();
    }
}

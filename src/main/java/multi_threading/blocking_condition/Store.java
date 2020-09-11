package multi_threading.blocking_condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Store {

    private int product = 0;
    ReentrantLock locker;
    Condition condition;

    Store() {
        locker = new ReentrantLock();
        condition = locker.newCondition();
    }

    public void get() {

        locker.lock();

        try {

            while (product < 1) {
                condition.await();
            }
            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на складе: " + product);

            condition.signalAll();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }
    }

    public void put() {

        locker.lock();

        try{

            while (product >= 3) {
                condition.await();
            }
            product++;
            System.out.println("Продавец добавил 1 товар");
            System.out.println("Всего товара: " + product);

            condition.signalAll();
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        finally {
            locker.unlock();
        }
    }
}

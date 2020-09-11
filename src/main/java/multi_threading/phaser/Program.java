package multi_threading.phaser;

import java.util.concurrent.Phaser;

public class Program {

    public static void main(String[] args) {

        Phaser phaser = new Phaser(1);
        new Thread(new PhaseThread(phaser, "Phaser 1")).start();
        new Thread(new PhaseThread(phaser, "Phaser 2")).start();
        new Thread(new PhaseThread(phaser, "Phaser 3")).start();
        new Thread(new PhaseThread(phaser, "Phaser 4")).start();
        new Thread(new PhaseThread(phaser, "Phaser 5")).start();

        int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");

        phaser.arriveAndDeregister();
    }
}

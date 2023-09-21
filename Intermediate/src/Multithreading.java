// Threads -> Processes working concurrently / simultaneously

// Eat and Watch TV

class Eat extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Eating...");

            // add sleep/pause timing
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Runnable - interface

class WatchTv implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Watching TV...");

            // add sleep/pause timing
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Eat eat = new Eat();
        WatchTv watchTv = new WatchTv();
        Thread watchTVThread = new Thread(watchTv);

        eat.start();
        watchTVThread.start();
    }
}
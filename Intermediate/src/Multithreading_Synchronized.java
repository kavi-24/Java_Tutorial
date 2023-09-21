// When running two threads that access a single method

class Counter {
    int count;

    synchronized public void increment() {
        count++;
    }

    // synchronized - locks a single thread with the shared data so that no other
    // thread can access it...

}

public class Multithreading_Synchronized {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        int limit = 24000;

        Thread t1 = new Thread(
                new Runnable() {
                    public void run() {
                        for (int i = 0; i < limit; i++) {
                            c.increment();
                        }
                    }
                });

        Thread t2 = new Thread(
                new Runnable() {
                    public void run() {
                        for (int i = 0; i < limit; i++) {
                            c.increment();
                        }
                    }
                });

        t1.start();
        t2.start();

        // wait until increment ends
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

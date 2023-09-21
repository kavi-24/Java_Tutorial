// join -> make the main thread wait until other threads/processes have finished.

public class Multithreading_JoinAlive {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(
                // lambda/arrow expression
                () -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Hi");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                });

        Thread t2 = new Thread(
                // lambda/arrow expression
                () -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Hey");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                });

        
        System.out.println("Threads started");

        t1.start();
        t2.start();

        t1.join();

        System.out.println("................");

        t2.join();

        System.out.println("Threads finished");

    }
}

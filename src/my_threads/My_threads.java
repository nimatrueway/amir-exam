package my_threads;

import java.util.concurrent.Semaphore;

public class My_threads {

    static Semaphore semaphore1 = new Semaphore(1); // can I proceed for thread1
    static Semaphore semaphore2 = new Semaphore(0); // can I proceed for thread2

    static Runnable print1 = new Runnable() {
        @Override
        public void run() {
            try {
                semaphore1.acquire();
                for (int i = 0; i < 100; i++) {
                    if (i == 5) {
                        semaphore2.release();
                        semaphore1.acquire();
                    }
                    System.out.println("Amir");
                }
            } catch (InterruptedException e) {
                // ---
            }
        }
    };

    static Runnable print2 = new Runnable() {
        @Override
        public void run() {
            try {
                semaphore2.acquire();
                for (int i = 0; i < 100; i++) {
                    System.out.println("I love Java");
                }
                semaphore1.release(); // Now let's make print1 continue
            } catch (InterruptedException e) {
                // ---
            }
        }
    };

    static Thread thread1 = new Thread(print1);
    static Thread thread2 = new Thread(print2);

    public static void main(String[] args) throws InterruptedException {
        // thread1 --- 5 print ----------------- 95 print ---
        // thread2 --------------- 100 print ----------------

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();


    }


}

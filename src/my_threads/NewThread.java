package my_threads;

public class NewThread {
    // Create threads
    static Thread thread1;
    static Thread thread2;


    public static void main(String[] args) {
        // Create tasks
        Runnable printA = new MyPrintString("Amir", 100);
        Runnable printB = new MyPrintString2("I Love Java", 100);


        // Create threads
        thread1 = new Thread(printA);
        thread2 = new Thread(printB);

        // Start threads
        // You should not invoke run() instead of start().
        // Invoking run() directly merely executes this method in the same thread; no new thread is started.
        thread1.start();
        thread2.start();

    }

        static class MyPrintString extends Thread implements Runnable {
        private String StringToPrint; // The character to print
        private int times; // The times to repeat

        public MyPrintString(String c, int t) {
            StringToPrint = c;
            times = t;
        }

        public void run() {
            for (int i = 0; i < times; i++) {
                System.out.print(StringToPrint+'\n');

                    if (i == 5) {
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }



            }
        }
    }


    static class MyPrintString2 extends Thread implements Runnable {
        private String StringToPrint1;
        private int times2;

        public MyPrintString2(String c, int t) {
            StringToPrint1 = c;
            times2 = t;
        }

        public void run() {
            for (int i = 0; i < times2; i++) {
                System.out.print(StringToPrint1+'\n');

            }
        }
    }


}

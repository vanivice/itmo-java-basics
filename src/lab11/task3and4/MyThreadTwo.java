package lab11.task3and4;

import java.util.concurrent.CountDownLatch;

public class MyThreadTwo {
    public static void resCount() {

        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(100);

        try {
            System.out.println("Потоки запускаются...");
            for (int i = 0; i < 100; i++) {
                Thread thread = new Thread(() -> {
                    for (int j = 0; j < 1000; j++) {
                        counter.increment();
                    }
                    latch.countDown();
                });
                thread.start();
            }
            latch.await();
            System.out.println("count: " + counter.getCount());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void outputName() {
        Object objectMonitor = new Object();
        try {
            Thread threadOne = new Monitor(objectMonitor);
            Thread threadTwo = new Monitor(objectMonitor);

            threadOne.start();
            threadTwo.start();

            Thread.sleep(10000);

            threadOne.interrupt();
            threadTwo.interrupt();

        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    public static class Monitor extends Thread {
        private Object monitor;

        Monitor(Object monitor) {
            this.monitor = monitor;
        }

        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                    synchronized (monitor) {
                        System.out.printf("выполняется " + getName() + "\n");
                        sleep(500);
                        monitor.notify();
                        monitor.wait();
                    }
                }
            } catch (InterruptedException error) {
                System.out.printf("поток " + getName() + " завершен\n");
            }
        }
    }
}

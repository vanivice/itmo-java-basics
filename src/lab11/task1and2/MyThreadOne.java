package lab11.task1and2;

public class MyThreadOne implements Runnable {
    private int streamNum;
    public MyThreadOne(int streamNum) {
        this.streamNum = streamNum + 1;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("поток " + streamNum + " | число: " + i);
        }
    }

    public static class NewThread {

        public static void threadStart(int num) {
            for (int i = 0; i < num; i++) {
                Thread thread = new Thread(new MyThreadOne(i));
                thread.start();
            }
        }
    }

    public static class OneThread extends Thread {
        public static void threadStatus() {
            try {
                Thread.sleep(2000);
                Thread threadOne = new OneThread();
                System.out.println("поток создан | статус: " + threadOne.getState());
                threadOne.start();
                System.out.println("поток запущен | статус: " + threadOne.getState());
                threadOne.join();
                System.out.println("поток завершен | статус: " + threadOne.getState());
            }
            catch (InterruptedException error) {
                System.out.println(error.getMessage());
            }
        }

        @Override
        public void run() {
            System.out.println("поток начал свою работу");
            try {
                for (int i = 1; i < 10; i++) {
                    System.out.println("выполнение... | статус: " + Thread.currentThread().getState());
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

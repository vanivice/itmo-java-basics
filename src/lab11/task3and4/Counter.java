package lab11.task3and4;

public class Counter {

    int count = 0;

    public synchronized void increment() {
        count += 1;
    }

    public int getCount() {
        return count;
    }
}

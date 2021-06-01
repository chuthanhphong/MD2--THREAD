package bt4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new NumberGenerator("Thread1"));
        Thread thread2 = new Thread(new NumberGenerator("Thread2"));

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();

    }
}

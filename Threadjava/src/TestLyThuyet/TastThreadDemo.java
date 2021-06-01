package TestLyThuyet;

public class TastThreadDemo  {
    public static void main(String[] args) {
        Runnable printA = new PrintChar('a',100);
        Runnable printB = new PrintChar('b',100);
        Runnable printC = new PrintNum(100);
        Thread thread = new Thread(printA);
        Thread thread1 = new Thread(printB);
        Thread thread2 = new Thread(printC);
        thread.start();
        thread1.start();
        thread2.start();

    }
}

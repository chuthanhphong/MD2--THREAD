package bt5;

public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        even.join();
        odd.start();
    }
}

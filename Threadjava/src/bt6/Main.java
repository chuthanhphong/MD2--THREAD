package bt6;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LazyPrimeFactorization th1 = new LazyPrimeFactorization("th1");
        OptimizedPrimeFactorization th2 = new OptimizedPrimeFactorization("th2");
        Thread choice1 = new Thread(th1);
        Thread choice2 = new Thread(th2);
        choice1.start();
        choice1.join();
        choice2.start();
    }
}

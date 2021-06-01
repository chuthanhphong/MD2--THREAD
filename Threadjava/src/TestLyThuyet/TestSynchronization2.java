package TestLyThuyet;

public class TestSynchronization2 {
    public static void main(String[] args) {
        Table obj = new Table();
        Mythread2 t1 = new Mythread2(obj);
        Thread1 t2 = new Thread1(obj);
        t1.start();
        t2.start();

    }
}

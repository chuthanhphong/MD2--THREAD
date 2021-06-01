package TestLyThuyet;

public class Test1 extends Thread {
    public void run(){
        System.out.println("done");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.start();
    }
}

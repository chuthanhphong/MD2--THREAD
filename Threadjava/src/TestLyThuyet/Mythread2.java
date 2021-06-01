package TestLyThuyet;

public class Mythread2 extends Thread {
    Table t ;
    Mythread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

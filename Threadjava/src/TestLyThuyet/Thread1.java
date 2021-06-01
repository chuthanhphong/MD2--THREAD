package TestLyThuyet;

public class Thread1 extends Thread{
    Table table;

    public Thread1(Table obj) {

    }

    void MyThread1(Table table){
        this.table =table;
    }
    public void run(){
        table.printTable(5);
    }


}

package bt1;

import TestLyThuyet.PrintNum;

public class main {
    public static void main(String[] args) {
        System.out.println("Main Thread running.......... ");
        RunableDemo runableDemo = new RunableDemo("Thread-1-HR-Database");
        runableDemo.start();
        RunableDemo runableDemo1 = new RunableDemo("Thread-2-Send-Email");
        runableDemo1.start();
        System.out.println("Main Thread stopped!!");
    }


}

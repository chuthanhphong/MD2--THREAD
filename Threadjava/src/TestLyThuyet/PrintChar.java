package TestLyThuyet;

public class PrintChar implements Runnable {
    private char chartoPrint;
    private int time;
    public PrintChar(char c,int t){
        chartoPrint = c;
        time = t;
    }

    @Override
    public void run() {
        for(int i =0;i<time;i++){
            System.out.println(chartoPrint);
        }
    }
}

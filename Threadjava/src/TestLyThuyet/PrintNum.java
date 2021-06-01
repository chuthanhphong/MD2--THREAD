package TestLyThuyet;

public class PrintNum implements Runnable {
    private int lastnum;
    public PrintNum(int num) {
         lastnum = num;
    }

    @Override
    public void run() {
        for(int i =0;i<lastnum;i++){
            System.out.println(" " + i);
        }
    }
}

package bt3;

public class Count implements Runnable {
    private Thread mythread;

    public Count() {
        mythread = new Thread(this,"my runnable thread");
        System.out.println("my thread created :" + mythread);
        mythread.start();
    }

    public Thread getMythread() {
        return mythread;
    }

    @Override
    public void run() {
        try {
            for(int i =0;i<10;i++){
                System.out.println("print the count " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}

package bt5;

public class EvenThread extends Thread {
    public void run(){
        for(int i =0;i<=10;i++){
            if(i%2!=0){
                System.out.println("số lẻ là : " + i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}

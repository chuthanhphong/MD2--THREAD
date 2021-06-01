package bt5;

public class OddThread extends Thread {
    public void run(){
        for(int i =0;i<=10;i++){
            if(i%2==0){
                System.out.println("Số chẵn là : " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}

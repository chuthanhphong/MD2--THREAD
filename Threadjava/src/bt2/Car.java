package bt2;

import java.util.Random;

public class Car implements Runnable {
    private String car;
    public  final static int DISTANCE = 100;
    public final static int STEP = 2;

    public Car(String car) {
        this.car = car;
    }

    @Override
    public void run() {
        int RunDistance = 0;
        long starTime = System.currentTimeMillis();
        while (RunDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                RunDistance += speed;
               String log = " |";
                int percentTravel = (RunDistance*100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP)
                    {
                       log+= "=";
                    }else if(percentTravel >= i && percentTravel < i +STEP){
                        log += "o";
                    }
                    else {
                        log+= "-";
                    }
                }
                log+= "-";
                System.out.println("Car" + this.car + " : " + log + " " + Math.min(DISTANCE,RunDistance) + " km");
                Thread.sleep(1000);
            }catch (Exception e ){
                System.out.println("Car" + this.car + " broken...");
                break;
            }
        }
        long endTime  = System.currentTimeMillis();
        System.out.println("Car" + this.car + " Finish in " + ((endTime - starTime)/1000) + "s");
    }
}

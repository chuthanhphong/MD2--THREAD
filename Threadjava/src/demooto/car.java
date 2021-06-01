package demooto;

import java.util.Random;

public class car implements Runnable {
    private String name;
    private final int DISTANCE =100;
    private final int STEP = 2;

    public car() {
    }

    public car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int rundistace=0;
        Long time = System.currentTimeMillis();

        while (rundistace<DISTANCE){
            try {
                int speed = new Random().nextInt(20);
                rundistace+= speed;
                int percentTravel = (rundistace*100)/DISTANCE;
                String log ="|";
                for(int i =0;i<DISTANCE;i+=STEP){
                    if(percentTravel>= i+STEP){
                        log+= " =";
                    }else if(percentTravel >= i && percentTravel < i +STEP){
                        log+= "o";
                    }else {
                        log+= "-";
                    }

                }
                log += "-";
                System.out.println("Car" + this.name + " : " + log + " " + Math.min(DISTANCE,rundistace) + " km");
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
    }
}

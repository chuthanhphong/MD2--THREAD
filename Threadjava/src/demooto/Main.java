package demooto;

public class Main {
    public static void main(String[] args) {
        car car = new car("car1");
        car car1 = new car("car2");
        car car2 = new car("car3");
        Thread car11 = new Thread(car);
        Thread car22 = new Thread(car1);
        Thread car33 = new Thread(car2);
        System.out.println("Distance 100km");
        car11.start();
        car22.start();
        car33.start();

    }
}
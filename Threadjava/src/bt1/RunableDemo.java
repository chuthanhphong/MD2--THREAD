package bt1;

public class RunableDemo implements Runnable {
    private Thread t;
    private final String name;

    public RunableDemo(String name) {
        this.name = name;
        System.out.println("Creating " + name);

    }

    @Override
    public void run() {
        System.out.println("Running " + name);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread" + name + " ," + i);
                Thread.sleep(40);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted.");
        }
        System.out.println("Thread " +
                name + " existing");
    }

    public void start() {
        System.out.println("Starting " + name);
        if (t == null) {
            t = new Thread(this, name);
            t.start();
        }
    }
}

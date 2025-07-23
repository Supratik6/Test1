public class SleepDemo extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                // Pause thread for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) {
        SleepDemo t1 = new SleepDemo();
        SleepDemo t2 = new SleepDemo();

        t1.setName("Thread-One");
        t2.setName("Thread-Two");

        t1.start();
        t2.start();
    }
}

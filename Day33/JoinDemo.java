
public class JoinDemo extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Step: " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) {
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();

        try {
            // Main thread waits for t1 to finish
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // Now start t2 after t1 completes
        t2.start();
    }
}

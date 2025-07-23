public class ThreadFeatureDemo extends Thread {

    public ThreadFeatureDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " - isDaemon: " + isDaemon());
        System.out.println(getName() + " - isAlive at start: " + isAlive());

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted!");
                System.out.println(getName() + " - isInterrupted(): " + isInterrupted());
                return;
            }
        }

        System.out.println(getName() + " - finished normally.");
    }

    public static void main(String[] args) {
        // Create user thread
        ThreadFeatureDemo userThread = new ThreadFeatureDemo("UserThread");

        // Create daemon thread and set as daemon before starting
        ThreadFeatureDemo daemonThread = new ThreadFeatureDemo("DaemonThread");
        daemonThread.setDaemon(true);  // ⚠️ Must be set BEFORE start()

        // Start both threads
        userThread.start();
        daemonThread.start();

        // Print isAlive status right after starting
        System.out.println(userThread.getName() + " isAlive after start: " + userThread.isAlive());
        System.out.println(daemonThread.getName() + " isAlive after start: " + daemonThread.isAlive());

        // Interrupt user thread after 2.5 seconds
        try {
            Thread.sleep(2500);
            userThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // Wait for user thread to finish
        try {
            userThread.join(); // Wait only for user thread, not daemon
        } catch (InterruptedException e) {
            System.out.println("Join interrupted");
        }

        // Final thread status
        System.out.println(userThread.getName() + " isAlive after join: " + userThread.isAlive());
        System.out.println(daemonThread.getName() + " isAlive (might be false if main ended): " + daemonThread.isAlive());

        System.out.println("Main thread exiting.");
    }
}

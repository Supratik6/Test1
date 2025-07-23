public class YieldDemo extends Thread {

    public YieldDemo(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Iteration " + i);
            
            // Suggest the scheduler to switch to another thread
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldDemo t1 = new YieldDemo("Thread-A");
        YieldDemo t2 = new YieldDemo("Thread-B");

        // Start both threads
        t1.start();
        t2.start();

        // Check if threads are alive immediately after start
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Check again after completion
        System.out.println("Is " + t1.getName() + " alive after join? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive after join? " + t2.isAlive());

        System.out.println("Main thread finished.");
    }
}

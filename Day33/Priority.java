public class Priority extends Thread {

    // Override run() to print thread info
    public void run() {
        System.out.println(Thread.currentThread().getName() +
            " is running with priority " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        // Create two threads
        Priority t1 = new Priority();
        Priority t2 = new Priority();

        // Set custom thread names
        t1.setName("HighPriorityThread");
        t2.setName("LowPriorityThread");

        // Demonstrating setPriority()
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1 Min priority means the process wil complete after longest time...

        // Start the threads
        t1.start();
        t2.start();

        // Demonstrating getPriority()
        System.out.println("Thread ID: " + t1.getId() +
            ", Name: " + t1.getName() +
            ", Priority: " + t1.getPriority());

        System.out.println("Thread ID: " + t2.getId() +
            ", Name: " + t2.getName() +
            ", Priority: " + t2.getPriority());
    }
}

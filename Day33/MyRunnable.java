class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted!");
            }
        }

        System.out.println(Thread.currentThread().getName() + " finished execution.");
    }

    public static void main(String[] args) {
        // Create Runnable object
        MyRunnable runnableTask = new MyRunnable();

        // Create Thread objects with Runnable
        Thread t1 = new Thread(runnableTask, "Worker-1");
        Thread t2 = new Thread(runnableTask, "Worker-2");

        // Start both threads
        t1.start();
        t2.start();

        // Show if threads are alive
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // After join
        System.out.println("Is " + t1.getName() + " alive after join? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive after join? " + t2.isAlive());

        System.out.println("Main thread ends.");
    }
}

public class ThreadStateDemo1 extends Thread {
    public void run() {
        System.out.println(getName() + " is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
        System.out.println(getName() + " has finished.");
    }

    public static void main(String[] args) {
        ThreadStateDemo1 t1 = new ThreadStateDemo1();
        System.out.println("State before start: " + t1.getState());  // NEW

        t1.start();  // Moves thread to RUNNABLE state

        System.out.println("State after start: " + t1.getState());   // RUNNABLE or TIMED_WAITING

        try {
            Thread.sleep(500);  // Let the thread run
            System.out.println("State during run: " + t1.getState());  // RUNNABLE or TIMED_WAITING
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State after completion: " + t1.getState());  // TERMINATED
    }
}
